package ru.job4j.lite.bank;

import java.util.*;

/**
 * Банковские операции с пользователями, счетами и транзациями между ними.
 * Created by Alexey Dvoryaninov  - (lexxzone@gmail.com)
 *
 * @since 22.07.2018
 */
public class BankOperations {

    /*
    Реализовать коллекцию Map <User, List<Account>>, обозначающую что у каждого пользователя может быть список банковских счетов.
Необходимо реализовать возможность перечислять деньги, как с одного счёта User на другой счёт того же User, так и на счёт другого User.
В программе должны быть методы:
public void addUser(User user) {} - добавление пользователя.
public void deleteUser(User user) {} - удаление пользователя.
public void addAccountToUser(String passport, Account account) {} - добавить счёт пользователю.
public void deleteAccountFromUser(String passport, Account account) {} - удалить один счёт пользователя.
public List<Accounts> getUserAccounts (String passport) {} - получить список счетов для пользователя.
public boolean transferMoney (String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount)
- метод для перечисления денег с одного счёта на другой счёт:
если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
Посмотрите на методы Map.putIfAbsent и List.indexOf, как их можно применить в этом задании.
     */

    Map<User, List<Account>> customers = new TreeMap<>();


    /**
     * Добавление нового пользователя.
     *
     * @param user новый пользователь.
     * @since 1.8+
     */
    public void addUser(User user) {
        customers.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Удаление пользователя.
     * Метод сначала проверяет на наличие указанного в параметре метода
     * пользователя в коллекции, а затем, если он найден, удаляет его.
     *
     * @param user пользователь, которого нужно удалить.
     */
    public void deleteUser(User user) {
        /*if (customers.containsKey(user)) {
            customers.remove(user);
        }*/
        for (Map.Entry<User, List<Account>> entry : customers.entrySet()) {
            if (entry.getKey().equals(user)) {
                customers.remove(entry);
            }
        }

    }

    /**
     * Добавление нового счета пользователю по номеру паспорта.
     *
     * @param passport номер паспорта пользователя.
     * @param account  новый счет пользователя.
     */
    public void addAccountToUser(String passport, Account account) {
        Set<User> allCustomers = customers.keySet();
        for (User customer : allCustomers) {
            if (customer.getPassport().equals(passport)) {
                for (Map.Entry<User, List<Account>> entry : customers.entrySet()) {
                    if (entry.getKey().equals(customer)) {
                        if (entry.getValue().contains(account)) {
                            System.out.println("Такой счет уже существует");
                        } else {
                            entry.getValue().add(account);
                        }
                    }
                }
            } else {
                System.out.println("Пользователь с указанным паспортом не найден");
            }
        }
    }

    /**
     * Удаление счета пользователя по номеру паспорта.
     *
     * @param passport номер паспорта.
     * @param account  счет, который нужно удалить.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        for (Map.Entry<User, List<Account>> entry : customers.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                for (Account singleAccount : entry.getValue()) {
                    if (singleAccount.equals(account)) {
                        entry.getValue().remove(account);
                    }
                }
            }
        }
    }

    /**
     * Получение списка счетов пользователя по номеру паспорта.
     *
     * @param passport номер паспорта.
     * @return списко счетов пользователя.
     */
    public List<Account> getUserAccounts(String passport) {
        List<Account> resultList = new ArrayList<>();
        /*Set<User> allCustomers = customers.keySet();
        for (User customer : allCustomers) {
            if (customer.getPassport().equals(passport)) {
                for (Map.Entry<User, List<Account>> entry : customers.entrySet()) {
                    if (entry.getKey().getPassport().equals(passport)) {
                        resultList.addAll(entry.getValue());
                    }
                }
            } else {
                System.out.println("Пользователь с указанным паспортом не найден");
            }
        }
        */

        for (Map.Entry<User, List<Account>> entry : customers.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                resultList.addAll(entry.getValue());
            }
        }
        return resultList;
    }

    /**
     * Проверяет возможность совершения транзакции между счетами.
     *
     * @param srcPassport  Паспорт отправителя.
     * @param srcRequisite Счет отправителя.
     * @param dstPassport  Паспорт получателя.
     * @param dstRequisite Счет получателя.
     * @param amount       Сумма перевода.
     * @return Истина если возможно, ложь если нет.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String dstPassport,
                                 String dstRequisite, double amount) {
        boolean isTransaction = false;
        boolean checkSrcPass = false;
        boolean checkDstPass = false;
        boolean checkSrcReq = false;
        boolean checkDstReq = false;
        boolean checkAmount = false;
        User destUser = null;
        Account destAccount = null;
        if (srcPassport.equals("") ||
                srcRequisite.equals("") ||
                dstPassport.equals("") ||
                dstRequisite.equals("") ||
                amount == 0.0) {
            isTransaction = false;
        } else {
            for (Map.Entry<User, List<Account>> entry : customers.entrySet()) {
                if (entry.getKey().getPassport().equals(srcPassport)) {
                    checkSrcPass = true;
                }
                if (entry.getKey().getPassport().equals(dstPassport)) {
                    checkDstPass = true;
                }
                if (entry.getValue().contains(dstRequisite)) {
                    checkDstReq = true;
                    destUser = entry.getKey();
                    for (Account account : entry.getValue()) {
                        if (account.getRequisites().equals(dstRequisite)) {
                            destAccount = account;
                        }
                    }
                }
                if (entry.getValue().contains(srcRequisite)) {
                    checkAmount = true;
                }
                if (entry.getValue().contains(srcRequisite)) {
                    checkSrcReq = true;
                    for (Account account : entry.getValue()
                    ) {
                        if (account.getRequisites().equals(srcRequisite)) {
                            checkAmount = (account.getValue() - amount) > 0;
                            if (checkSrcPass &&
                                    checkSrcReq &&
                                    checkDstPass &&
                                    checkDstReq &&
                                    checkAmount == true) {
                                isTransaction = true;
                                account.setValue(account.getValue() - amount);
                                for (Map.Entry<User, List<Account>> entry1 : customers.entrySet()) {
                                    if (entry1.equals(destUser)) {
                                        entry1.getValue().get(entry1.getValue().indexOf(destAccount)).setValue(entry1.getValue().get(entry1.getValue().indexOf(destAccount)).getValue() + amount);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return isTransaction;
    }


}

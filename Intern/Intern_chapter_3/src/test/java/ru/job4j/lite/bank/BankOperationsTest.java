package ru.job4j.lite.bank;

import org.junit.Before;
import org.junit.Test;

/**
 * 22.08.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class BankOperationsTest {

    BankOperations bankOperations = new BankOperations();

    @Before
    public void PutBankInfo() {
        bankOperations.addUser(new User("John Rodds", "98765890"));
        bankOperations.addUser(new User("Terry Willson", "98790654"));
        bankOperations.addUser(new User("Angela Rohos", "98954852"));
        //TODO Проверить как привязываются аккаунты к пользователям

    }

    @Test
    public void TransactionFromOneToAnotherCustomer() {
        //bankOperations.transferMoney()
    }



}

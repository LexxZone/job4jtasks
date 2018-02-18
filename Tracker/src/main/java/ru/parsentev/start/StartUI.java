package ru.parsentev.start;
import ru.parsentev.models.*;

/**
 * @version $Id$
 * @since 0.1
 */

public class StartUI {
    
    private static final String ADD = "0";
    private static final String SHOWALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDID = "4";
    private static final String FINDNAME = "5";
    private static final String EXIT = "6";
    
    private final Input input;
    private final Tracker tracker;
    
    
    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    
    //private 
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    
    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
            //добавление заявки вынесено в отдельный метод.
                this.createItem();
            } else if (SHOWALL.equals(answer)) {
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDID.equals(answer)) {
                this.findById();
            } else if (FINDNAME.equals(answer)) {
                this.findByName();   
            } else if (EXIT.equals(answer)) {
                exit = true;
                System.out.println("\n.....\n......\n.......\n......... выход из программы ...........\n.......\n......\n.....");
            } else {
                System.out.println(".............................................\n [В Н И М А Н И Е]\nВы ввели несуществующий пункт меню. Пожалуйста, введите корректный пункт меню\n.............................................");
            }
        }
    }
    
    
    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки : ");
        String desc = this.input.ask("Введите описание заявки : ");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + " создана! -----------");
    }
    
    /**
     * Метод реализует вывод всех заявок в хранилище.
     */
    private void showAllItems() {
        System.out.println("***\n------------ Существующие заявки --------------");
         for (Item item : this.tracker.getAll()) {
            if (item != null) {
                System.out.println("[Заявка]: " + item.getName() +". [Описание]: " + item.getDescription() + ". [id]: " + item.getId());
            }
        }
        
       
        System.out.println("***");
    }
    
    private void editItem(){
        String id = this.input.ask("Введите id заявки, которую нужно исправить: ");
         Item item = this.tracker.findById(id);
         if (item != null) {
			String name = this.input.ask("Введите имя заявки : ");
        	String desc = this.input.ask("Введите описание заявки : ");
        	this.tracker.replace(id, name, desc);

         } else {
         		System.out.println ("Ошибка изменения заявки");
         }
        
        

    }
    
    
     private void deleteItem(){
         String id = this.input.ask("Введите id заявки, которую нужно удалить: ");
         this.tracker.delete(id);
         System.out.println("Заявка " + id + " удалена! \n***");
    }
    
    
    /**
     * Метод реализует поиск заявки в хранилище по Id.
     */
    private void findById() {
        System.out.println("------------ Поиск заявки по Id --------------");
        String id = this.input.ask("Введите id заявки : ");
        Item result = this.tracker.findById(id);
        /* Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            } else {
                result = "not found";
                   }
        }
        */
        if (result == null) {System.out.println("не найдено");
        } else {System.out.println("Информация по запросу:\n" + result + "\n[название]: " + result.getName() + "\n[описание]: " + result.getDescription()); 
             }
    }
    
    
    private void findByName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите ИМЯ заявки : ");
        Item result = this.tracker.findByName(name);

        if (result == null) {System.out.println("не найдено");
        } else {System.out.println("Информация по запросу:\n" + result + "\n[название]: " + result.getName() + "\n[описание]: " + result.getDescription() + "\n[id]: " + result.getId()); 
             }
    }
    
    
    /*public void init(){
        
        String name = input.ask("Please choose action: \n0. Add new Item \n1. Show all items \n2. Edit item \n3. Delete item \n4. Find item by Id \n5. Find items by name \n6. Exit Program \n Select:");
        
        Tracker tracker = new Tracker();
        tracker.add(new Task(name, "first desc"));
        for (Item item: tracker.getAll()){
            System.out.println(item.getName());
        }
        
    } */
    
    private void showMenu() {
        System.out.println("Please choose action: \n0. Add new Item \n1. Show all items \n2. Edit item \n3. Delete item \n4. Find item by Id \n5. Find items by name \n6. Exit Program \n Select:");
    }
    
    public static void main(String[] args){
        /*Input input = new ConsoleInput();
        new StartUI(input).init();
        */
        new StartUI(new ConsoleInput(), new Tracker()).init();
        
        
        
    }
}
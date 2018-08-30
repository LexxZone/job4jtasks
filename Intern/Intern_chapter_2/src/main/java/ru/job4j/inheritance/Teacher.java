package ru.job4j.inheritance;

/**
 * Учитель class.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Teacher extends Profession {

    /**
     * Поле класса - имя.
     */
    public String name;

    /**
     * Поле класса - предмет.
     */
    String subject = "History";

    /**
     * Конструктор класса по-умолчанию.
     */
    public Teacher() {
        this.name = "Ip Man";
    }

    /**
     * Конструктор класса с параметром имени.
     * @param   name
     *          Имя человека.
     */
    public Teacher(String name) {
        this.name = name;
    }

    /**
     * Получение преподаваемого предмета.
     * @return  Предмет.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Получение информации о преподавателе и студенте, которому задается ДЗ.
     * @param   student
     *          Имя студента.
     */
    public void giveHomeWork(String student) {
        System.out.println("Teacher " + this.name + " give homework to " + student);
    }

    /**
     * Получение информации о преподавателе и обучаемом студенте.
     * @param   student
     *          Имя студента.
     */
    public void teach(String student) {
        System.out.println("Teacher " + this.name + " is teaching " + student);
    }

    /**
     * Информация о преподавателе и экзаменуемом студенте.
     * @param   student
     *          Имя студента.
     */
    public void test(String student) {
        System.out.println("Teacher " + this.name + " is testing " + student);
    }

    /**
     * Консольное представление о профессии.
     */
    public void say() {
        System.out.println("I'm an teacher");
    }

}

package ru.job4j.inheritance;

/**
 * Доктор class.
 * Created by Alexey Dvoryaninov - (lexxzone@gmail.com)
 */
public class Doctor extends Profession {

    /**
     * Поле класса.
     * Имя.
     */
    public String name;

    /**
     * Поле класса.
     * Специальность.
     */
    public String speciality = "surgeon";

    /**
     * Конструктор класса с параметром.
     * @param   n
     *          имя.
     */
    public Doctor(String n) {
        this.name = n;
    }

    /**
     * Конструктор класса по-умолчанию.
     */
    public Doctor() {
        this.name = "Gregory House";
    }


    /**
     * Получение специальности.
     * @return специальность.
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * Метод выводит информацию о докторе и диагностируемом пациенте.
     * @param   pacient
     *          Имя пациента.
     */
    public void diagnose(String pacient) {
        System.out.println("Doctor " + this.getName() + " diagnose pacient " + pacient);
    }

    /**
     * Метод выводит информацию о лечащем докторе и пациенте.
     * @param   pacient
     *          имя пациента.
     */
    public void cure(String pacient) {
        System.out.println("Doctor " + this.getName() + " cure pacient " + pacient);
    }

    /**
     * Метод выводит информацию о докторе и оперируемом пациенте.
     * @param   pacient
     *          имя пациента.
     */
    public void operate(String pacient) {
        System.out.println("Doctor " + this.getName() + " operate pacient " + pacient);
    }

    /**
     * Консольное представление специальности.
     * Выводит: я - доктор.
     */
    @Override
    public void say() {
        System.out.println("I'm a doctor");
    }

}

package ru.job4j.lite.bank;

/**
 * Класс отдельного счета.
 * Created by Alexey Dvoryaninov on 22.07.2018 - (lexxzone@gmail.com)
 */
public class Account {

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Количество денег.
     */
    private double value;

    /**
     * Счет.
     */
    private String requisites;

    public String getRequisites() {
        return this.requisites;
    }

}

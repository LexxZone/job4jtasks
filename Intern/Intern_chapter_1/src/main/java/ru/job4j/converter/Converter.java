package ru.job4j.converter;

/**
 * Корвертор валюты.
 * Конвертируем рубли в евро.
 */
public class Converter {

    /**
     * 1 евро = 70 рублей.
     */
    static final int EURO = 70;
    /**
     * 1 доллар = 60 рублей.
     */
    static final int DOLLAR = 60;

    /**
     * Конвертируем рубли в Евро.
     * @param value
     *          сумма в рублях
     * @return  сумма в Евро
     */
    public int rubleToEuro(int value) {
        int totalEuro = Math.round(value / this.EURO);
        return totalEuro;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param   value
     *          сумма в рублях
     * @return  Сумма в долларах
     */
    public int rubleToDollar(int value) {
        int totalDollars = Math.round((value / this.DOLLAR));
        return totalDollars;
    }
}

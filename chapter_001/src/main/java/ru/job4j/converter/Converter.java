package ru.job4j.converter;
import java.math.BigDecimal;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * 1 доллар = 60 рублей.
     * 1 евро = 70 рублей
     * @param value рубли.
     * @return Евро.
     */
    int euro = 70;
    int dollar = 60;
    
    public int rubleToEuro(int value) {
        
        int totalEuro = Math.round(value / this.euro);
        
        return totalEuro;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        int totalDollars = Math.round((value / this.dollar));
        return totalDollars;
    }
}
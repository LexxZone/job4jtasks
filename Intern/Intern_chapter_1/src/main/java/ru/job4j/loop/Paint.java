package ru.job4j.loop;

/**
 * Пирамида в псевдографике.
 * Created by Alex Dvoryaninov on 12.03.18
 */
public class Paint {

    /**
     * Метод рисует пирамиду в псевдографике.
     * @param   h
     *          высота пирамиды
     * @return  пирамида в псевдографике
     */
    public String piramid(int h) {
        StringBuilder fullString = new StringBuilder();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h * 2 - 1; j++) { // line
                if (j <= h - i || j >= h + i) {
                    fullString.append(" ");
                } else {
                    fullString.append("^");
                }
            }
            fullString.append(System.getProperty("line.separator"));
        }
        return fullString.toString();
    }

}

package ru.job4j.questions;

/**
 * Created by Alex Dvoryaninov on 12.03.18
 */
public class WordInside {


    /**
     * Проверяет. что одно слово входит в другое.
     *
     * @param origin исходное слово, в котором проводится поиск.
     * @param sub слово, коорое ищем.
     * @return если слово входит в другое
     */
    /*boolean contains(String origin, String sub) {

        boolean check = false;

        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        StringBuilder sbOrigin = new StringBuilder();
        StringBuilder sbSub = new StringBuilder(sub);

        for (int i = 0; i < originArray.length; i++) {
            if (originArray.length < subArray.length) {

                System.out.println("ОШИБКА: Слово, которое мы проверяем на вхождение, больше, чем исходное, в котором мы проверяем вхождение");
                break;
            }

            // если i-й элемент в исходном массиве равен первому в субмассиве
            if (originArray[i] == sbSub.getChars(0, 1)) {
                for (int index = i; index < sbArray.length; index++) {

                    String item = String.valueOf(this.getData()[i]);
                    dataString.append(item);
                }
            }



        }






        return check;
    }*/

    String origin;
    String sub;

    public static void main(String [] args) {
        WordInside wordInside = new WordInside("Привет", "иве");
        //System.out.println(wordInside.origin + " " + wordInside.sub);

        boolean result = wordInside.contains(origin, sub);

        System.out.println(wordInside.contains(wordInside.origin, wordInside.sub));


    }

   public WordInside(String origin, String sub) {
        this.origin = origin;
        this.sub = sub;
    }



    boolean result = contains(origin, sub);

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param origin Исходное слово.
     * @param sub Проверочное слово.
     * @return если слово начинаеться с префикса
     */
    public boolean contains(String origin, String sub) {

        System.out.println(origin + " " + sub);

        char[] originArray = origin.toCharArray();


        StringBuilder originString = new StringBuilder();
        for (int i = 0; i < originArray.length; i++) {

            String item = String.valueOf(originArray[i]);
            originString.append(item);
        }

        char[] subArray = sub.toCharArray();



        //result = dataString.toString().startsWith(valueString.toString());

        for (int index = 0; index < originArray.length; index++) {
            if (originArray[index] == subArray[0]) {

                for (int i = 0; i < subArray.length; i++) {
                    String item = String.valueOf(originArray[i + index]);
                    originString.append(item);
                }
            }
        }



        StringBuilder subString = new StringBuilder();
        for (int i = 0; i < subArray.length; i++) {

            String item = String.valueOf(subArray[i]);
            subString.append(item);
        }


        return originString == subString;
    }

}



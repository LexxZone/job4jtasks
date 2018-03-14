package ru.job4j.loop;

public class Board {


         // visual testing-----
        public static void main(String[] args) {
            String g = paint(7, 7);
            System.out.println(g);

        }
        



        public  static  String paint(int width, int height) {

            StringBuilder fullString = new StringBuilder();

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if ((i + j) % 2 == 0) {
                        fullString.append("x");
                    }   else {
                        fullString.append(" ");
                    }
                }
                fullString.append(System.getProperty("line.separator"));
            }

            return fullString.toString();
        }

}
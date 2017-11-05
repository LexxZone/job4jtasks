package ru.job4j.loop;

public class Paint {

        /*  
          // visual testing in terminal -----
        public static void main(String[] args){
            String g = piramid(7);
            System.out.println(g);

        }
        */



        public /* static */ String piramid (int h){

            StringBuilder fullString = new StringBuilder();

            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= h*2 -1; j++) { // line
                    if (j<=h-i||j>=h+i) {
                        fullString.append(" ");
                    }   else {
                        fullString.append("^");
                    }
                }
                
                fullString.append(System.getProperty("line.separator"));
            }

            return fullString.toString();
        }

}
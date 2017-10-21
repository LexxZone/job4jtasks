package ru.job4j.condition;

public class Point {
    
       private int x;
       private int y;
     
       public  Point(int x, int y) {
          this.x = x;
          this.y = y;
           
        public boolean is(int a, int b) {
        return y == a * x + b;
           
      }
      
      public int getX() {
          return this.x;
      }
     
      public int getY() {
         return this.y;
      }
    
     
    //2. Задано уравнение функции y(x) = a * x + b;
     
    //3. Добавьте метод в класс Point определяющий находится ли точка на этой фукнции.
     
    public boolean is(int a, int b) {
        return y == a * x + b; // используя оператор if проверить что точка (x, y) принадлежит функции y(x) = a * x + b;
    }
}
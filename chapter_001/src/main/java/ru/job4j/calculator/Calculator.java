package ru.job4j;

public class Calculator {
        private double result;

    public static void main (String[] args){


        public void add(double first, double second) {
            this.result = first + second;
        }

        public  void substract (double first, double second){
            this.result = first - second;
        }

        public  void div (double first, double second){
            this.result = first / second;
        }

        public  void multiple (double first, double second){
            this.result = first - second;
        }


        public double getResult() {
            return this.result;
        }

    }
    
    
}
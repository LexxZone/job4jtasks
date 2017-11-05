package ru.job4j.loop;

public class Factorial{
    public int calc(int n) {
     int factorial = 1;    
     for (i=1; i<=n; i+1){
         factorial = factorial*i;
     }   
        return factorial;
    }
}
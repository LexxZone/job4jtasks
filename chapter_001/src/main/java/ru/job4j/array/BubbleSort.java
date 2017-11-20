package ru.job4j.condition;

public class BubbleSort {
        
    
    public int[] sort (int[] array) {
            
            boolean checkpoint = true;
            int replaces = 0;
                
            while (checkpoint = true){
                
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i+1]){
                        int z = array[i];
                        array[i] = array[i+1];
                        array[i +1] = z;
                        replaces ++;
                    }
                
                }
                if (replaces > 0){
                    checkpoint = false;
                }
                
            }

            return array;
        }

}
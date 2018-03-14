package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int z = array[i]; // set int z var and get i-value from array
            array[i] = array[array.length - 1 - i];   // set value for i-element from array reversed element value
            array[array.length - 1 - i] = z;   // set reversed element value from z var
        }

        return array;
    }

}
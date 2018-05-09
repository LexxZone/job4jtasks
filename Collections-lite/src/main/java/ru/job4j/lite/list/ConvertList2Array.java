package ru.job4j.lite.list;
/**
 * Created by Alex Dvoryaninov on 06.05.18
 */

import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {

        int cells = list.size() / rows + (list.size() % rows == 0 ? 0 : 1);

        //System.out.println(list.get(list.size() - 1) + " - last element \n" + list.size() + " - размер");

        int[][] array = new int[rows][cells];

        int i = 0;
        int j = 0;

        for (Integer item : list) {

            array[i][j] = item;

            j++;

            if (j == rows) {
                j = 0;
                i++;
            }
        }

        return array;
    }

}


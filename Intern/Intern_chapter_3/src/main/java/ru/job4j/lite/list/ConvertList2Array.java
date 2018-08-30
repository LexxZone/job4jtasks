package ru.job4j.lite.list;
/**
 * Created by Alex Dvoryaninov (lexxzone@gmail.com) on 24.05.18
 * <p>
 * This class has methods for converting List to Array and Array to List
 */

import java.util.ArrayList;
import java.util.List;


public class ConvertList2Array {

    /**
     * Converting List to Array
     * @param   list
     *          List of int values
     * @param   rows
     *          quantity of rows
     * @return  array
     */
    public int[][] toArray(List<Integer> list, int rows) {

        int cells = list.size() / rows + (list.size() % rows == 0 ? 0 : 1);

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

    /**
     * Converting List of int arrays to ArrayList
     *
     * @param   list
     *          List of int array values
     * @return  ArrayList
     */
    public List<Integer> convert(List<int[]> list) {

        List<Integer> result = new ArrayList<>();

        for (int[] singleArray : list) {

            for (int i = 0; i < singleArray.length; i++) {

                result.add(singleArray[i]);

            }
        }

        return result;
    }

}


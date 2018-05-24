package ru.job4j.lite.list;
/**
 * Created by Alex Dvoryaninov on 24.05.18
 */

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {

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

    public List<Integer> convert(List<int[]> list) {

        List<Integer> result = new ArrayList<>();

        for (int[] singleArray : list) {

            for (int i = 0; i < singleArray.length; i++) {

                result.add(singleArray[i]);

            }
        }

        return result;
    }

/*    public static void main(String[] args) {

        ConvertList2Array CL2A = new ConvertList2Array();

        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> result = CL2A.convert(list);

    }*/

}


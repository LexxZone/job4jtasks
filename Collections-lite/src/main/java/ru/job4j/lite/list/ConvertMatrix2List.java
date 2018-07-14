package ru.job4j.lite.list;

/**
 * Created by Alexey Dvoryaninov on 22.05.18 - (lexxzone@gmail.com)
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Converting Matrix to ArrayList
 */
public class ConvertMatrix2List {

    /**
     * This method is converting Matrix to ArrayList
     *
     * @param   array
     *          incoming matrix
     * @return  list
     *          final ArrayList
     */
    public List<Integer> toList(int[][] array) {

        List<Integer> list = new ArrayList<>();

        for (int first = 0; first < array.length; first++) {

            for (int second = 0; second < 2; second++) {

                list.add(array[first][second]);

            }
        }

        return list;
    }
}
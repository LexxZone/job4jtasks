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
     * This method is converting list of arrays to single Integer list
     *
     * @param   list
     *          incoming list of arrays
     * @return  list2
     *          final Integer List
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> list2 = new ArrayList<>();
        for (int[] singleArray : list) {
            for (int singleInt : singleArray) {
                list2.add(singleInt);
            }
        }
        return list2;
    }
}
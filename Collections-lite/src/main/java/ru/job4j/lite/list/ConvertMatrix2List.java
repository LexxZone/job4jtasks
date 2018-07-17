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
        for (int single : list2) {
            System.out.printf("%s ", single);
        }
        return list2;
    }

    public static void main(String[] args) {
        ConvertMatrix2List m2l = new ConvertMatrix2List();
        List<int[]> list3 = new ArrayList<>();
        list3.add(new int[]{1, 2});
        list3.add(new int[]{4, 3, 9, 4, 5, 6, 8});
        list3.add(new int[]{1, 14, 4});

        List<Integer> result = m2l.convert(list3);
    }
}
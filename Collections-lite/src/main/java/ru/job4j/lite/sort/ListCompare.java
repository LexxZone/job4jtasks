package ru.job4j.lite.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Alexey Dvoryaninov on 14.07.2018 - (lexxzone@gmail.com)
 *
 * <p>
 * This is element to element comparison of two Strings
 */
public class ListCompare implements Comparator<String> {

    /**
     * Compares two strings lexicographically
     *
     * @param   left
     *          first String to be compared
     * @param   right
     *          second String to be compared
     * @return  result
     *          negative integer if left less than right, zero if left
     *          equals right or a positive integer if right is greater than left
     */
    @Override
    public int compare(String left, String right) {
        int result = 0;
        // get minimal length of two strings
        int minLength = Math.min(left.length(), right.length());
        // create char arrays from strings
        char[] leftCh = left.toCharArray();
        char[] rightCh = right.toCharArray();
        // comparing of two char arrays symbol by symbol
        for (int i = 0; i < minLength; i++) {
            if (leftCh[i] != rightCh[i]) {
                if (leftCh[i] < rightCh[i]) {
                    result = -1;
                } else {
                    result = 1;
                }
            }
        }
        // if result after comparison of two char arrays is 0
        // than comparing lengths of words
        if (result == 0) {
            if (left.length() < right.length()) {
                result = -1;
            } else if (left.length() > right.length()) {
                result = 1;
            }
        }
        return result;
    }
}

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
     * @return  result -
     *          negative integer if left less than right, zero if left
     *          equals right or a positive integer if right is greater than left
     *
     * Description:
     *          1. get minimal length of two strings
     *          2. create char arrays from strings
     *          3. comparing of two char arrays symbol by symbol
     *          4. if result after comparison of two char arrays is 0
     *             than comparing lengths of words
     */
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int minLength = Math.min(left.length(), right.length());
        char[] leftCh = left.toCharArray();
        char[] rightCh = right.toCharArray();
        for (int i = 0; i < minLength; i++) {
            if (leftCh[i] != rightCh[i]) {
                result = Character.compare(leftCh[i], rightCh[i]);
            }
        }
        if (result == 0) {
            result = left.length() -  right.length();
        }
        return result;
    }
}

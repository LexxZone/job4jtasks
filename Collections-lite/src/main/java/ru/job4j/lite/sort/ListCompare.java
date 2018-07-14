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
     * @return  a negative integer if left less than right, zero if left
     *          equals right or a positive integer if right is greater than left
     */
    @Override
    public int compare(String left, String right) {

        int leftLength = left.length();
        int rightLength = right.length();
        int minLength = Math.min(leftLength, rightLength);

        List<Character> leftOne = new ArrayList<>();

        for (int i = 0; i < left.length(); i++) {
            leftOne.add(i, left.charAt(i));
        }

        List<Character> rightOne = new ArrayList<>();

        for (int i = 0; i < right.length(); i++) {
            rightOne.add(i, right.charAt(i));
        }

        int a = -10000;
        int b = 0;
        while (b < minLength) {
            char char1 = leftOne.get(b);
            char char2 = rightOne.get(b);
            if (char1 != char2) {
                a = char1 - char2;
            }
            b++;
        }
        return a == -10000 ? leftLength - rightLength : a;
    }
}

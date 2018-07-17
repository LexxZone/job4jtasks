package ru.job4j.lite.list;

/**
 * Created by Alexey Dvoryaninov on 22.05.18 - (lexxzone@gmail.com)
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test of converting few Arrays into single Integer list
 */
public class ConvertMatrix2ListTest {

    /**
     * In this method at the first we add few int Arrays
     * with different size into single multi array.
     * After that we convert it into single Integer List
     * and compare final result with expected result
     */
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(new int[]{1, 2});
        listOfArrays.add(new int[]{4, 3, 9, 4, 5, 6, 8});
        listOfArrays.add(new int[]{1, 14, 4});
        List<Integer> expect = Arrays.asList(
                1, 2, 4, 3, 9, 4, 5, 6, 8, 1, 14, 4
        );
        List<Integer> result = list.convert(listOfArrays);
        assertThat(result, is(expect));
    }
}
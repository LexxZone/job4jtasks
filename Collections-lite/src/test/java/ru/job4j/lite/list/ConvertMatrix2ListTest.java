package ru.job4j.lite.list;

/**
 * Created by Alexey Dvoryaninov on 22.05.18 - (lexxzone@gmail.com)
 */
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4, 5, 6
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
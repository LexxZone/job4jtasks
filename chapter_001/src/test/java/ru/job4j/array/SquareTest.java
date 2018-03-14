package ru.job4j.array;

import org.junit.Test;
import ru.job4j.max.Max;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Alex Dvoryaninov on 11.03.18
 */
public class SquareTest {

    @Test
    public void checkFourthElementOfArray() {
        Square square = new Square();

        int[] check = square.calculate(10);

        int result = check[5];
        assertThat(result, is(25));
    }


}

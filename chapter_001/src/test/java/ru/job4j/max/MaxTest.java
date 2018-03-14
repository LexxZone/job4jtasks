package ru.job4j.max;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstMoreSecondAndThird() {
        Max maxim = new Max();
        int result = maxim.max(4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMoreFrstAndThird() {
        Max maxim = new Max();
        int result = maxim.max(4, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMoreFrstAndSecond() {
        Max maxim = new Max();
        int result = maxim.max(4, 5, 6);
        assertThat(result, is(6));
    }

}
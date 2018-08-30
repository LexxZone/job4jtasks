package ru.job4j.questions;

import org.junit.Test;
import ru.job4j.array.ArrayChar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Alex Dvoryaninov on 14.03.18
 */

public class WordInsideTest {
    @Test
    public void whenFirstWordIncludeSecondWord() {
        WordInside wordInside = new WordInside();
        boolean result = wordInside.contains("Привет", "ри");
        assertThat(result, is(true));
    }

    @Test
    public void whenFirstWordNotIncludeSecondWord() {
        WordInside wordInside = new WordInside();
        boolean result = wordInside.contains("Привет", "рев");
        assertThat(result, is(false));
    }
}

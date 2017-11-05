package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
    
int expect = 30; // set checking value
        
Counter counter = new Counter();  // call for class

int result = counter.add(0, 10); // call for .add and send start and finish values
        
	assertThat(result, is(expect));

    }
}
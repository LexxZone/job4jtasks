package ru.job4j.lite.sort;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Alexey Dvoryaninov on 23.06.2018 - (lexxzone@gmail.com)
 *
 * This test is testing different methods of sorting
 *
 */
public class SortUserTest {
    /**
     *
     * Creating new users
     * Put them into list without sorting
     * Sort it in result
     * Comparing it with expected (manually sorted array)
     *
     */
    @Test
    public void whenNotSortedListThenSortedList2() {
        List<User> list = new ArrayList<>();
        User chris = new User("Chris", 27);
        User bella = new User("Bella", 22);
        User john = new User("John", 37);
        User sven = new User("Sven", 29);
        User alex = new User("Alex", 30);
        User jess = new User("Jess", 29);
        list.add(chris);
        list.add(bella);
        list.add(john);
        list.add(sven);
        list.add(alex);
        list.add(jess);
        User [] result = new SortUser().sort(list).toArray(new User[0]);
        User [] expected = new User [] {bella, chris, jess, sven, alex, john};
        assertThat(result, is(expected));

    }

    /**
     *  This Test is checking sorting of dynamic array of objects <User> by the name length
     */
    @Test
    public void whenSortedByNameLength() {     // ---------
        List<User> list = new ArrayList<>();
        User chris = new User("Christian", 27);
        User bella = new User("Bella", 22);
        User john = new User("Johnny", 37);
        User sven = new User("Sven", 29);
        User alex = new User("Alexandr", 30);
        User jess = new User("Jessica", 29);
        list.add(chris);
        list.add(bella);
        list.add(john);
        list.add(sven);
        list.add(alex);
        list.add(jess);
        User [] result = new SortUser().sortNameLength(list).toArray(new User[0]);
        User [] expected = new User [] {sven, bella, john, jess, alex, chris};
        assertThat(result, is(expected));
    }

    /**
     *  This Test is checking sorting of dynamic array of objects <User> by the name and after by the age
     */
    @Test
    public void whenSortedByAllFields() {    // --------
        List<User> list = new ArrayList<>();
        User chris = new User("Chris", 27);
        User bella = new User("Bella", 22);
        User john = new User("John", 37);
        User jess2 = new User("Jess", 40);
        User sven = new User("Sven", 29);
        User chris2 = new User("Chris", 20);
        User alex = new User("Alex", 30);
        User jess = new User("Jess", 29);
        list.add(chris);
        list.add(bella);
        list.add(john);
        list.add(jess2);
        list.add(sven);
        list.add(chris2);
        list.add(alex);
        list.add(jess);
        User [] result = new SortUser().sortByAllFields(list).toArray(new User[0]);
        User [] expected = new User [] {alex, bella, chris2, chris, jess, jess2, john, sven};
        assertThat(result, is(expected));
    }

}

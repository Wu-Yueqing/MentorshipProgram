package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortListTest {
    static List<Integer> testList;
    static List<Integer> expectedList;

    @BeforeAll
    public static void init() {
        testList = List.of(0, 4, 2, 3, 5, 1);
        expectedList = List.of(0, 1, 2, 3, 4, 5);
    }

    @Test
    public void testSortListWithSortStrategy() {
        SortStrategy sortStrategy = new InsertionSort();
        assertEquals(Main.sortList(testList, sortStrategy), expectedList);

        sortStrategy = new MergeSort();
        assertEquals(Main.sortList(testList, sortStrategy), expectedList);
    }
}

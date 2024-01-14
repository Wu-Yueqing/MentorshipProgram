package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");
        List<Integer> list = List.of(0, 4, 2, 15, 5, 1, 9, 7, 12, 10, 11, 8, 3, 14, 13, 6);
        SortStrategy sortStrategy = new SelectionSort();
        sortStrategy.sort(list);

        sortStrategy = new MergeSort();
        sortStrategy.sort(list);

        sortStrategy = new InsertionSort();
        sortStrategy.sort(list);
    }
}

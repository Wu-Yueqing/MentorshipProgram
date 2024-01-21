package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");
        List<Integer> list = List.of(0, 4, 2, 15, 5, 1, 9, 7, 12, 10, 11, 8, 3, 14, 13, 6);

        List<Integer> sortedListInsertion = sortList(list, new InsertionSort());
        System.out.println(sortedListInsertion);

        List<Integer> sortedListSelection = sortList(list, new SelectionSort());
        System.out.println(sortedListSelection);

        List<Integer> sortedListMerge = sortList(list, new MergeSort());
        System.out.println(sortedListMerge);

    }

    public static List<Integer> sortList(List<Integer> list, SortStrategy sortStrategy) {
        return sortStrategy.sort(list);
    }
}

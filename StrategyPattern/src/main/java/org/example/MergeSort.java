package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class MergeSort implements SortStrategy {
    @Override
    public List<Integer> sort(List<Integer> list) {
        System.out.println("Merge sort the list");
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}

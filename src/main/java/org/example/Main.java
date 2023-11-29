package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> list1 = List.of(1.0, 2.0, 3.0);
        List<Double> list2 = List.of(4.0, 5.0, 6.0);

        ListComparator listComparator = new ListComparator();
        listComparator.compareAndPrint(list1, list2);
    }
}

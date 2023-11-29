package org.example;

import java.util.List;

public class ListComparator {
    public void compareAndPrint(List<Double> list1, List<Double> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        System.out.println("Среднее значение первого списка: " + average1);
        System.out.println("Среднее значение второго списка: " + average2);

        if (average1 > average2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (average2 > average1) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }

    public double calculateAverage(List<Double> list) {
        double sum = 0;
        for (Double num : list) {
            sum += num;
        }
        return sum / list.size();
    }
}

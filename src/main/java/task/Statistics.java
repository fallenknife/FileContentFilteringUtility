package task;

import java.util.Collections;
import java.util.List;

import static task.util.*;

public class Statistics {
    private static void showFullStatistics() {
        showShortStatistics();
        System.out.println("Minimal integer: " + Collections.min(integerList) + " Maximal integer: " + Collections.max(integerList));
        System.out.println("Integer sum: " + sum(integerList) + " Average of integers:" + (sum(integerList) / integerList.size()));

        System.out.println("Minimal float: " + Collections.min(floatList) + " Maximal float: " + Collections.max(floatList));
        System.out.println("Integer sum: " + sum(floatList) + " Average of integers: " + (sum(floatList) / floatList.size()));

        System.out.println("Minimal string length: " + minString() + " Maximal string length: " + maxString());
    }

    private static void showShortStatistics() {
        System.out.println("Integers written:" + integerList.size());
        System.out.println("Float written:" + floatList.size());
        System.out.println("String written:" + stringList.size());
    }

    public static void showStatistics() {
        if (fullStatistics) {
            showFullStatistics();
        } else if (shortStatistics) {
            showShortStatistics();
        }
    }

    private static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    private static long minString() {
        long min = stringList.getFirst().length();
        for (String s : stringList) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        return min;
    }

    private static long maxString() {
        long max = stringList.getFirst().length();
        for (String s : stringList) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

}

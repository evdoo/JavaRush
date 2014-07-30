package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
        static {
            labels.put(1d, "A");
            labels.put(1.2, "B");
            labels.put(3.6, "Hello");
            labels.put(5d, "String");
            labels.put(6.7, "C");
        }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

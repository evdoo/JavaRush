package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        List<Integer> list = new ArrayList<Integer>();
        BufferedReader numberReader = new BufferedReader(new FileReader(fileName));

        String num;

        while ((num = numberReader.readLine()) != null) {
            int number = Integer.parseInt(num);
            if (number % 2 == 0) {
                list.add(number);
            }
        }

        Collections.sort(list);

        for (int x : list) {
            System.out.println(x);
        }
    }
}

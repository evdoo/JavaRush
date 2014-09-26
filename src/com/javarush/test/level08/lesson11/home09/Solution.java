package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{

    public static void main(String[] args) throws ParseException
    {
        System.out.println("JANUARY 1 2000 = " + isDateOdd("JANUARY 1 2000"));
        System.out.println("JANUARY 2 2020 = " + isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        SimpleDateFormat format = new SimpleDateFormat("MMM dd yyy", Locale.US);
        Date currentDate = format.parse(date);

        Date yearStartDate = new Date(currentDate.getYear(), 0, 0);

        long millisecondCount = currentDate.getTime() - yearStartDate.getTime();
        int dayCount = (int) (millisecondCount / (24 * 60 * 60 * 1000));
        int isOdd = dayCount % 2;
        if (isOdd != 0)
        {
            return true;
        } else
        {
            return false;
        }
    }
}

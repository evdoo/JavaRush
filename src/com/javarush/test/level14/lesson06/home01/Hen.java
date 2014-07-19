package com.javarush.test.level14.lesson06.home01;

public abstract class Hen implements Country
{
    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я курица.";
    }
}

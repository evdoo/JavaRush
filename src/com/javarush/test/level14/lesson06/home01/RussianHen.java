package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth() {
        return 70;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

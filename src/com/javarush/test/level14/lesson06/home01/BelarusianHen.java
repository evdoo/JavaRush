package com.javarush.test.level14.lesson06.home01;

public class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth() {
        return 110;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

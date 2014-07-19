package com.javarush.test.level14.lesson06.home01;

public class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth() {
        return 90;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

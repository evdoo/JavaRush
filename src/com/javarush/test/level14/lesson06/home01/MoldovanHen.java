package com.javarush.test.level14.lesson06.home01;

public class MoldovanHen extends Hen
{
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

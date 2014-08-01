package com.javarush.test.level15.lesson12.home05;

public class SubSolution extends Solution {

    public SubSolution() {
    }

    public SubSolution(int i) {
        super(i);
    }

    public SubSolution(String s) {
        super(s);
    }

    SubSolution(int i, boolean f) {
        super(i, f);
    }

    SubSolution(String s, Object o) {
        super(s, o);
    }

    SubSolution(Object o, int i) {
        super(o, i);
    }

    protected SubSolution(String s, String k) {
        super(s, k);
    }

    protected SubSolution(String s, String k, int i) {
        super(s, k, i);
    }

    protected SubSolution(int i, int j, int l) {
        super(i, j, l);
    }

    private SubSolution(int i, String s) {
    }
    private SubSolution(int i, int j) {
    }
    private SubSolution(int i, int j, String s) {
    }
}

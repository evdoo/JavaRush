package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution() {
    }
    public Solution(int i) {
    }
    public Solution(String s) {
    }

    private Solution(int i, String s) {
    }
    private Solution(int i, int j) {
    }
    private Solution(int i, int j, String s) {
    }

    protected Solution(String s, String k) {
    }
    protected Solution(String s, String k, int i) {
    }
    protected Solution(int i, int j, int l) {
    }

    Solution(int i, boolean f) {
    }
    Solution(String s, Object o) {
    }
    Solution(Object o, int i) {
    }
}


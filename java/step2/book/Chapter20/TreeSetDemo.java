package Chapter20;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        System.out.println("Начальный размер связного списка: " + ts.size());
        System.out.println("Ввод элементов в связный список...");
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("D");
        ts.add("E");
        System.out.println("Размер связного списка: " + ts.size());
        System.out.println("Coдepжимoe связного списка: " + ts);
    }
}

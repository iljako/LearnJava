package Chapter20;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        System.out.println("Начальный размер связного списка: " + hs.size());
        System.out.println("Ввод элементов в связный список...");
        hs.add("C");
        hs.add("A");
        hs.add("B");
        hs.add("D");
        hs.add("E");
        System.out.println("Размер связного списка: " + hs.size());
        System.out.println("Coдepжимoe связного списка: " + hs);
    }
}
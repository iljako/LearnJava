package Chapter20;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Начальный размер списочного массива: " + al.size());
        System.out.println("Ввод элементов в списочный массив...");
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("D");
        al.add("E");
        System.out.println("Размер списочного массива: " + al.size());
        System.out.println("Coдepжимoe списочного массива: " + al);
        System.out.println("Удаление элементов из списиочного массива...");
        al.remove("A");
        al.remove(1);
        System.out.println("Размер списочного массива: " + al.size());
        System.out.println("Coдepжимoe списочного массива: " + al);
    }
}
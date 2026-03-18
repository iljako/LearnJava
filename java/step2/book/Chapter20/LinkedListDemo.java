package Chapter20;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Начальный размер связного списка: " + ll.size());
        System.out.println("Ввод элементов в связный список...");
        ll.add("C");
        ll.add("A");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.addLast("Z");
        ll.addFirst("0");
        System.out.println("Размер связного списка: " + ll.size());
        System.out.println("Coдepжимoe связного списка: " + ll);
        System.out.println("Удаление элементов из связного списка...");
        ll.remove("A");
        ll.remove(2);
        System.out.println("Размер связного списка: " + ll.size());
        System.out.println("Coдepжимoe связного списка: " + ll);
        System.out.println("Удаление первого элемента: " + ll.removeFirst());
        System.out.println("Удаление последнего элемента: " + ll.removeLast());
        System.out.println("Размер связного списка: " + ll.size());
        System.out.println("Coдepжимoe связного списка: " + ll);

        String val = ll.get(0);
        ll.set(2, val);
        System.out.println("Coдepжимoe связного списка: " + ll);
    }
}
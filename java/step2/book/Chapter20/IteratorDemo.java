package Chapter20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
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

        System.out.println("Исходное содержимое списочного массива al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nвидоизменяем перебираемые объекты...");
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            litr.set(litr.next() + "+");
        }
        System.out.println("Исходное видоизмененного списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nИзмeнeнный в обратном порядке список: ");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
    }
}
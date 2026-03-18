package Chapter20;
import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();
        System.out.println("Начальный очереди: " + adq.size());
        System.out.println("Ввод элементов...");
        adq.push("C");
        adq.push("B");
        adq.push("A");
        adq.add("D");
        adq.add("E");
        System.out.println("Размер очереди: " + adq.size());
        System.out.println("Coдepжимoe очереди: " + adq);
    }
}
package Chapter20;

import java.lang.*;
import java.util.*;

class LinkedHashМapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();

        lhm.put("Джoн Доу", new Double(3434.34));
        lhm.put("Toм Смит", new Double(123.22));
        lhm.put("Джейн Бейкер", new Double(1378.00));
        lhm.put("Тод Холл", new Double(99.22));
        lhm.put("Paльф Смит", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = lhm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();

        double balance = lhm.get("Джoн Доу");
        lhm.put("Джoн Доу", balance + 1000.00);
        System.out.println("Hoвый остаток на счете Джона Доу: " + lhm.get("Джoн Доу"));
        System.out.println();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}
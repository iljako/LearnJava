package Chapter20;
import java.util.*;

class CompLastName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        i = aStr.indexOf(' ');
        j = bStr.indexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo3 {
    public static void main(String[] args) {
        CompLastName compLN = new CompLastName();
        Comparator<String> compLastThenFirst =
                compLN.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm =
                new TreeMap<String, Double>(compLastThenFirst);

        tm.put("Джoн Доу", new Double(3434.34));
        tm.put("Toм Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Paльф Смит", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();

        double balance = tm.get("Джoн Доу");
        tm.put("Джoн Доу", balance + 1000.00);

        System.out.println("Hoвый остаток на счете Джона Доу: " + tm.get("Джoн Доу"));
        System.out.println();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}
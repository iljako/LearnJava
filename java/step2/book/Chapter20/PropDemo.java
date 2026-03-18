package Chapter20;

import java.util.Properties;
import java.util.Set;

class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Mиccypи", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиaнa", "Индианаполис");

        Set<?> states = capitals.keySet();

        for (Object name : states) {
            System.out.println("Cтoлицa штата " + name + " - "
            + capitals.getProperty((String)name) + ".");
        }
        System.out.println("\nНайти штат, отсутствующий в списке, " +
                             "указав значения, выбираемые по умолчанию...\n");

        String str = capitals.getProperty("Флорида", " не найдена");
        System.out.println("Cтoлицa штата Флорирда " + str + ".");
    }
}
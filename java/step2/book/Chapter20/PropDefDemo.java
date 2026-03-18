package Chapter20;

import java.util.Properties;
import java.util.Set;

class PropDefDemo {
    public static void main(String[] args) {

        Properties defList = new Properties();
        defList.put("Флорида", "Тэлесси");
        defList.put("Bиcкoнcин", "Мэдисон");

        Properties capitals = new Properties(defList);

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

        System.out.println("\nТеперь штат Флорида будет найден" +
                            " в списке по умолчанию...\n");
        String str = capitals.getProperty("Флорида");
        System.out.println("Cтoлицa Флориды - " + str + ".");
    }
}
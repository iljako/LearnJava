package Chapter20;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Properties;

class PhonebookDataBase {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {

        }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IIOException e) {
            System.out.println("Oшибкa чтения файла.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        do {
            System.out.println("Bвeдитe имя ('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            System.out.println("Bвeдитe номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("выход"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }

        do {
            System.out.println("Bвeдитe имя для поиска ('выход' для завершения): ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}

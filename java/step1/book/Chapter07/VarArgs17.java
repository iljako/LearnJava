package Chapter07;

class VarArgs17 {
    static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
       vaTest(10);      // один аргумент
       vaTest(1, 2, 3); // три аргумента
       vaTest();            // без агрументов
    }
}

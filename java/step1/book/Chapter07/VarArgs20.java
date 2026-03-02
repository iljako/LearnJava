package Chapter07;

class VarArgs20 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int ... v): "
                + "Количество аргументов: "
                + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ... v): "
                + "Количество аргументов: "
                + v.length + " Содержимое: ");
        for (boolean x : v) System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, true);
        //vaTest(); // ОШИБКА!!! Неоднозначность!
        vaTest(1);
    }
}
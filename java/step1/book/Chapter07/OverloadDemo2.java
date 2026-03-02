package Chapter07;

class OverLoad2 {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
    }

    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове" +
                            " test(double) a: " + a);
    }
}

class OverloadDemo2 {
    public static void main(String[] args) {
        OverLoad2 od = new OverLoad2();
        int i = 88;

        od.test();
        od.test(10, 20);
        od.test(i);         // вызывается вариант метода test(douЬle)
        od.test(123.45); // вызывается вариант метода test(douЬle)
    }
}
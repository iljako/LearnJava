package Chapter08;

class C {
    int i;
}

class D extends C {
    int i;

    D (int a) {
        super.i = a + 1; // i из Суперкласса C
        i = a; // i из Подкласса D
    }
    void showD() {
        System.out.println("i в Суперклассе C:\t" + super.i);
        System.out.println("i в Подклассе D:\t" + i);
    }
}

public class UseSuper05 {
    public static void main (String[] args) {
        C supC = new C();
        System.out.println("Суперкласс C.");
        System.out.println("supC.i : " + supC.i);
        System.out.println("\nПодкласс D.");
        D subD = new D(2);
        System.out.println("subD.i : " + subD.i);
        System.out.println("supC.i : " + supC.i);
        System.out.println("\nВызов метода subD.showD.");
        subD.showD();
    }
}
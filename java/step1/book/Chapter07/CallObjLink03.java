package Chapter07;

class Test03 {
    int a, b;
    Test03 (int i, int j) {
        a = i;
        b = j;
    }

    // передать объект
    void meth (Test03 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
public class CallObjLink03 {
    public static void main(String[] args) {
        Test03 ob = new Test03(15,20);
        System.out.println("ob.a, ob.b    до вызова: " + ob.a + ", " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a, ob.b после вызова: " + ob.a + ", " + ob.b);
    }
}
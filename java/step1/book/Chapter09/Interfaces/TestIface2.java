package Chapter09.Interfaces;

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        Client2 ob = new Client2();

        c.callback(42);

        c = ob; // теперь переменная c ссылается на объект ob типа Client2
        c.callback(3);

    }
}
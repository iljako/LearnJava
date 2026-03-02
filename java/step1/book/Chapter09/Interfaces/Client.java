package Chapter09.Interfaces;

class Client implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIntfaceMeth() {
        System.out.println("В классах реализующих интерфейсы, также могут определяться и другие члены.");
    }
}

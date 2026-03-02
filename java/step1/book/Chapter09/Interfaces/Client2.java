package Chapter09.Interfaces;
// Вторая реализация интерфейса Callback
class Client2 implements Callback {
    // реализовать интерфейс Callback обязательно с модификатором доступа public !!!
    public void callback (int p) {
        System.out.println("Еще одна версия callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}

package Chapter09.pkg01;

// получить экземпляры различных классов из пакета pkg01
class MainDemo {
    public static void main (String[] args) {
        Protection  pOb = new Protection();
        Derived     dOb = new Derived();
        SamePackage sOb = new SamePackage();
    }
}
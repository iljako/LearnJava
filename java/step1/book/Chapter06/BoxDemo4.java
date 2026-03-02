package Chapter06;
class Box4 {
    double width;
    double heigth;
    double depth;

    Box4 (double w, double h, double d) {
        width  = w;
        heigth = h;
        depth  = d;
    }

    double volume () {
        return width * heigth * depth;
    }
}
public class BoxDemo4 {
    public static void main (String[] args) {

        Box4 mybox4 = new Box4(10, 20, 15);
        Box4 mybox5 = new Box4(3, 6, 9);

        System.out.println("Объем (mybox4) = " + mybox4.volume());
        System.out.println("Объем (mybox5) = " + mybox5.volume());

    }
}
package Chapter06;

class Box5 {
    double width;
    double height;
    double depth;

    Box5 (double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    Box5 () {
    // значение -1 используется для неинициализированного параллелепипеда
        width  = -1;
        height = -1;
        depth  = -1;
    }

    Box5 (double len) {
        width = height = depth = len;
    }

    double volume () {
        return width * height * depth;
    }
}


public class BoxDemo5 {
    public static void main (String[] args) {
        Box5 mybox5 = new Box5(10, 20, 15);
        Box5 mybox6 = new Box5();
        Box5 mybox7 = new Box5(7);

        System.out.println("Объем (mybox5): " + mybox5.volume());
        System.out.println("Объем (mybox6): " + mybox6.volume());
        System.out.println("Объем (mybox7): " + mybox7.volume());
    }
}
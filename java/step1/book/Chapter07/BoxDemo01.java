package Chapter07;

class Box6 {
    double width;
    double height;
    double depth;

    Box6 (Box6 ob) { //передать объект конструктору
        width  = ob.width;
        height = ob.height;
        depth  = ob.depth;
    }

    Box6 (double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    Box6 () {
        width  = -1;
        height = -1;
        depth  = -1;
    }

    Box6 (double len) {
        width = height = depth = len;
    }

    double volume () {
        return width * height * depth;
    }
}

public class BoxDemo01 {
    public static void main (String[] args) {
        Box6 mybox6 = new Box6 (10, 20, 15);
        Box6 mybox7 = new Box6 ();
        Box6 mycube = new Box6 (7);

        // Создадим копию объекта mybox6
        Box6 myclone = new Box6 (mybox6);

        System.out.println("Объем (mybox6): " + mybox6.volume());
        System.out.println("Объем (mybox7): " + mybox7.volume());
        System.out.println("Объем (mycube): " + mycube.volume());
        System.out.println("Объем клона (myclone): " + myclone.volume());
    }
}
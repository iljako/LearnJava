package Chapter07;

class RecTest{
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    // выводим рекурсивно элементы массива
    void printArray(int i) {
        if(i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
public class Recursion06 {
    public static void main(String[] args) {
        RecTest obArrs = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++)  obArrs.values[i] = i;
        obArrs.printArray(10);
    }
}
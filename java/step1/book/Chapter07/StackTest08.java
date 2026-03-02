package Chapter07;

class Stack08 {
    private int[] stck = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack08() {
        tos = -1;
    }

    // поместить элемент в стек
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек загружен. (нет места для элемента): " + item);
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.print(" (Стек пуст.)");
            return 0;
        }
        else
            return stck[tos--];
    }
}
// Тестируем класс Stack
public class StackTest08 {
    public static void main (String[] args) {
        Stack08 mystack08 = new Stack08();
        Stack08 mystack09 = new Stack08();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack08.push(i);
        for (int i = 0; i < 20; i++) mystack09.push(i);
        System.out.println("-------------------------");
        // извлечь эти числа из стека
        for (int i = 0; i < 10; i++)
            System.out.println("Извлечь элемент из стека (mystack08): " + mystack08.pop());

        System.out.print("-------------------------");

        for (int i = 0; i < 20; i++)
            System.out.print("\nИзвлечь элемент из стека (mystack09): " + mystack09.pop());

        // эти операторы недопустимы
        // mystack08.tos = -2;
        // mystack09.stck[3] = 100;
    }
}
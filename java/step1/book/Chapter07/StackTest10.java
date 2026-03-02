package Chapter07;

class Stack10 {
    private int stck[];
    private int tos;

    // выделить память под стек и инициализировать его
    Stack10(int size) {
        stck = new int[size];
        tos  = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1)
            // использовать свойство длины массива
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек пуст.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class StackTest10 {
    public static void main(String[] args) {
        Stack10 mystack10 = new Stack10(5);
        Stack10 mystack11 = new Stack10(8);

        //разместить числа в стеке
        for (int i = 0; i < 5; i++) mystack10.push(i);
        for (int i = 0; i < 6; i++) mystack11.push(i);

        // извлечь эти числа из стека
        System.out.println("mystack10:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack10.pop());

        System.out.println("\nmystack11:");
        for (int i = 0; i < 6; i++)
            System.out.println(mystack11.pop());
    }
}
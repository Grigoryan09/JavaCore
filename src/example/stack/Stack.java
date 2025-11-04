package example.stack;

public class Stack {

    int[] stck = new int[10];
    int tos;

    Stack() {
        int i = tos - 1;
    }

    void push(int intem) {
        if (tos == 9) {
            System.out.println("стек заполнен");
        } else {
            stck[++tos] = intem;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("стек не загружен");
            return 0;
        }else {
            return stck[tos--];
        }

    }
}




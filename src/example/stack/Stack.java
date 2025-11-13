package example.stack;

public class Stack {

    char[] stck = new char[10];
    int tos;

    public Stack() {
        int i = tos - 1;
    }

    public void push(char item) {
        if (tos == 9) {
        } else {
            stck[++tos] = item;
        }
    }

    public char pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stck[tos--];
        }

    }
}




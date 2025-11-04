package example.stack;

public class TestSteck {
    static void main(String[] args) {

        Stack mystack = new Stack();

        for (int i = 0; i < 10; i++) {
            mystack.push(i);
        }
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());

    }
}

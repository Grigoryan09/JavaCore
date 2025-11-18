package example.recursion;

public class Recursion {
    static void main(String[] args) {

        Factorial f = new Factorial();
        RecTest ob = new RecTest(10);

        System.out.println("Фaктopиaл 3 равен " + f.fact(3));
        System.out.println("Фaктopиaл 4 равен " + f.fact(4));
        System.out.println("Фaктopиaл 5 равен " + f.fact(5));


        for ( int i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}

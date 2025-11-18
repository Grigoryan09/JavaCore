package example.examples;

public class For_each {
    static void main() {

        int[] nums = {1, 2, 3, 4, 5,6, 5, 7, 8, 5, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println("значение равно: " + x);
            sum += x;
        }
        System.out.println("сумма равно: " + sum);

        System.out.println("----------------------------");

        int sum1 = 0;
        for (int x : nums) {
            System.out.println(x);
            sum1 += x;
            if (x == 5) break;
        }
        System.out.println(sum1);

        System.out.println("--------------------------");


        int y = 0;
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                y++;
            }
        }
        if (found) {
            System.out.println(val);
            System.out.println(y);
        }else {
            System.out.println("chka");
        }
    }
}

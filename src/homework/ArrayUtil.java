package homework;

public class ArrayUtil {
    static void main() {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println("----------------");

        System.out.println(numbers[0]);

        System.out.println("----------------");

        System.out.println(numbers[numbers.length - 1]);

        System.out.println("----------------");

        System.out.println(numbers.length);

        System.out.println("----------------");


        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length - 1; i++) {
            if (maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
            if (minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }
        System.out.println(minValue);
        System.out.println(maxValue);


        System.out.println("----------------");


        if (numbers.length <= 2) {
            System.out.println(" can't print middle values");
        }
        if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2] + " , " + numbers[numbers.length / 2 - 1]);
        }
        if (numbers.length % 2 != 0) {
            System.out.println(numbers[numbers.length / 2]);
        }

        System.out.println("----------------");

        int couple = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0){
                couple++;
            }
            if ((numbers[i] % 2) != 0){
                odd++;
            }
        }
        System.out.println("Մասիվում զույգ թվերի քանակը - " + couple);
        System.out.println("Մասիվում կենտ թվերի քանակը - " + odd);

        System.out.println("----------------");

        int result = 0;
        for (int i = 0; i <numbers.length; i++) {
            result += numbers[i];
        }
        System.out.println(result);

        System.out.println("----------------");


        System.out.println(result / numbers.length);

    }
}

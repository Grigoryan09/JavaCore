package homework;

public class ArrayHomework {
    static void main() {

//        int[] numbers = {2, 15, -3, 7, 6, 9, 1, 6, -8 ,15, 22};

//        boolean found = false;
//        int n = 6;
//        int count = 0;
//        for (int x : numbers) {
//            if (x == n) {
//                count++;
//                found = true;
//            }
//        }
//        if (found) {
//            System.out.println(count);
//        } else {
//            System.out.println("0");
//        }

//        System.out.println("---------------------");

//        int x = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            x = numbers[i];
//        }
//        System.out.println(x);
//
//        System.out.println("---------------------");

        // Թարս դասավորել մասիվը տեղում
//        for (int i = 0; i < numbers.length / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[numbers.length - 1 - i];
//            numbers[numbers.length - 1 - i] = temp;
//        }
//
//        // Տպել արդյունքը
//        for (int x : numbers) {
//            System.out.print(x + " ");
//        }
//
//        System.out.println();
        System.out.println("-----------------------");


        int[] numbers = {5, 7, 5, 9, 2, 2, 6, 15, 4, 3, 6,15};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                for (int k = i + 1; k < numbers.length; k++) {
                    if (numbers[i] == numbers[k]) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);


        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա','շ', 'խ', 'ա', 'ր', 'հ'};
        char [] vowels = {'ա','է','ը','ի','օ',('ո'+'ւ')};
        int counts =0;
        for (int i = 0; i <vowels.length ; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (vowels[i] == chars[j]){
                    counts++;

                }
            }
        }
        System.out.println(counts);


    }
}









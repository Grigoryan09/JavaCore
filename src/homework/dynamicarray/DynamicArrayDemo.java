package homework.dynamicarray;

public class DynamicArrayDemo {

    static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(4);
        dynamicArray.add(7);
        dynamicArray.add(74);
        dynamicArray.add(92);
        dynamicArray.set(2,55);
        dynamicArray.add(1,15);
        System.out.println(dynamicArray.getIndexByValue(7));
        System.out.println(dynamicArray.exists(74));
//        dynamicArray.deleteByIndex(2);
        dynamicArray.print();


    }
}

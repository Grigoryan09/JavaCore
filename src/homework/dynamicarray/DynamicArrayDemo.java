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
        dynamicArray.add(92);
        dynamicArray.add(92);
        dynamicArray.add(92);
        dynamicArray.add(92);
        dynamicArray.add(92);


        dynamicArray.print();
        System.out.println(dynamicArray.getByIndex(6));
    }
}

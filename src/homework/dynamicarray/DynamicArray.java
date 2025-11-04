package homework.dynamicarray;


import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray {

    private int[] array;
    private int size;

    public DynamicArray() {
        array = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
//        for (int i = 0; i < size; i++) {
//            temp[i] = array[i];
//        }
        System.arraycopy(array ,0,temp ,0, size);
        array = temp;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return -1;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}



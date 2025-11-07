package homework.dynamicarray;

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

    public void add(int index, int value) {
        if (size == array.length) {
            extend();
        }
        if (index != -1 && index < size) {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            size++;
        } else {
            System.out.println("Wrong index");
        }
    }


    public void set(int index, int value) {
        if (index != -1 && index < size) {
            array[index] = value;
        } else {
            System.out.println("Wrong index");
        }
    }

    public void deleteByIndex(int index) {
        if (index != -1 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("Wrong index");
        }
    }


    private void extend() {
        int[] temp = new int[array.length + 10];
        System.arraycopy(array, 0, temp, 0, size);
        array = temp;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return -1;
        }
    }

    public boolean exists(int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                return i;
            }

        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}



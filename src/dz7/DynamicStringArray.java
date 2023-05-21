package dz7;

import java.util.Arrays;

public class DynamicStringArray {
    private String[] array;
    private int size;

    public DynamicStringArray() {
        array = new String[10];
        size = 0;
    }

    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }

        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;

        return true;
    }

    public boolean add(String value) {
        return add(size, value);
    }

    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;

        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return delete(i);
            }
        }

        return false;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        return array[index];
    }
}

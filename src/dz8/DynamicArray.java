package dz8;
import java.util.Arrays;

public class DynamicArray implements Collection {
    private String[] array;
    private int size;

    public DynamicArray() {
        array = new String[10];
        size = 0;
    }

    @Override
    public boolean add(String value) {
        if (size == array.length) {
            resize();
        }
        array[size] = value;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }
        if (size == array.length) {
            resize();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    @Override
    public boolean contain(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection other) {
        if (other == null || !(other instanceof DynamicArray)) {
            return false;
        }
        DynamicArray otherArray = (DynamicArray) other;
        if (size != otherArray.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(otherArray.array[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean clear() {
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    private void resize() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }
}

interface Collection {
    boolean add(String o);

    boolean add(int index, String o);

    boolean delete(String o);

    String get(int index);

    boolean contain(String o);

    boolean equals(Collection str);

    boolean clear();

    int size();
}

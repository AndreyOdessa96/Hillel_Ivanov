package dz12;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4) {
            throw new ArraySizeException("Array must have 4 rows");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException("Array must have 4 columns");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at cell (" + i + ", " + j + ")");
                }
            }
        }
        return sum;
    }
}

class ArraySizeException extends Exception {
    public ArraySizeException(String message) {
        super(message);
    }
}

class ArrayDataException extends Exception {
    public ArrayDataException(String message) {
        super(message);
    }
}

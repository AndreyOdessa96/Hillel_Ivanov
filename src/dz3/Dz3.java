package dz3;

public class Dz3 {
    public static void printOddNumbers() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void printOddNumbersWhile() {
        int i = 1;
        while (i <= 99) {
            System.out.print(i + " ");
            i += 2;
        }
    }

    public static int factorialWhile(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public static void printOddNumbersDoWhile() {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 99);
    }

    public static int factorialDoWhile(int n) {
        int result = 1;
        int i = 1;
        do {
            result *= i;
            i++;
        } while (i <= n);
        return result;
    }

    public static double power(double x, int n) {
        double result = 1.0;
        long absN = Math.abs((long) n);
        while (absN > 0) {
            if ((absN & 1) == 1) {
                result *= x;
            }
            x *= x;
            absN >>= 1;
        }
        return n < 0 ? 1 / result : result;
    }

    public static void printSequence() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
            num -= 5;
        }
    }

    public static void multiplicationTable(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }

    public static void printFirstTenOddNumbers() {
        int[] arr = new int[10];
        for (int i = 0, j = -5; i < arr.length; j -= 5, i++) {
            arr[i] = j;
            System.out.print(arr[i] + ", ");
        }
    }

    public static int findMinElement(int[] arr) {
        int minElement = arr[0];
        for (int element : arr) {
            if (element < minElement) {
                minElement = element;
            }
        }
        return minElement;
    }

    public static int findMaxElement(int[] arr) {
        int maxElement = arr[0];
        for (int element : arr) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public static void swapMinMax(int[] arr) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
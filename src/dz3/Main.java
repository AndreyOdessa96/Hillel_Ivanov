package dz3;

import java.util.Arrays;

import static dz3.Dz3.*;

public class Main {
    public static void main(String[] args) {
        printOddNumbers();
        System.out.println();

        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));

        printOddNumbersWhile();
        System.out.println();

        int m = 6;
        System.out.println("Factorial of " + m + " is " + factorialWhile(m));

        printOddNumbersDoWhile();
        System.out.println();

        int k = 7;
        System.out.println("Factorial of " + k + " is " + factorialDoWhile(k));

        double x = 2.0;
        int p = 3;
        System.out.println(x + "^" + p + " = " + power(x, p));

        printSequence();
        System.out.println();

        multiplicationTable(5);

        printFirstTenOddNumbers();
        System.out.println();

        int[] arr = {4, -5, 0, 6, 8};
        System.out.println("The minimum element in the array is: " + findMinElement(arr));
        System.out.println("The maximum element in the array is: " + findMaxElement(arr));

        swapMinMax(arr);

    }
    }

package com.company;

import java.util.Arrays;

public class ArrayDemo {


    public static int summaMassiva() {
        final int[] myArray = {1, 5, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    public static double averageMassiva() {
        int[] myArray = {1, 5, 4, 5, 6};

        return summaMassiva() / myArray.length;
    }

    public static int maxNumberMassiva() {
        int[] myArray = {1, 5, 4, 5, 6};
        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public static int[] addNumberArray() {

        int[] arrayDouble = new int[]{2, 5, 6, 7, 9};
        int n = arrayDouble.length;
        int d = 6;

        int[] newArray = new int[n + 1];

        for (int i = 0; i < n; i++)
            newArray[i] = arrayDouble[i];


        newArray[n] = d;
        return newArray;
    }

    public static void reverse(int[] array) {
        array = new int[]{2, 4, 5, 7, 8, 9, 70,90};


        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = (int) temp;
        }

            for (int j=0;j<array.length;j++){

        }
        System.out.println(Arrays.toString(array));
    }
}













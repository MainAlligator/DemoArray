package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Сумма массива: " + ArrayDemo.summaMassiva());
        System.out.println("Среднее значение значения  массива: " + ArrayDemo.averageMassiva());
        System.out.println("Максимальное число в массиве: " + ArrayDemo.maxNumberMassiva());
        System.out.println("Добавим число в массив : " + Arrays.toString(ArrayDemo.addNumberArray()));
        int [] expiArray = new int[] {1,4,6,78,9,10};
        ArrayDemo.reverse(expiArray);




      


    }

}



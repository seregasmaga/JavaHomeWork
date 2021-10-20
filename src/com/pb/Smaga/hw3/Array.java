package com.pb.Smaga.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введите массив из 10 целых чисел:");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Введен одномерный массив:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println("сумма чисел в массиве =" + sum);

        int counter = 0;
        for(int i = 0; i<10; i++)
        {
            if(array[i] > 0)
                counter += 1;
        }
        System.out.println("Количество положительных элементов массива = " + counter);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < 9; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.print("отсортированный массив");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
    }
}

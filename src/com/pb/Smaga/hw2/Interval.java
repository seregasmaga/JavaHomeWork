package com.pb.Smaga.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите целое число:");
        x = scan.nextInt();
        if (x>=0 && x<=14){
            System.out.print("Число попало в интервал [0-14]");
        } else if (x>=15 && x<=35){
            System.out.print("Число попало в интервал [15-35]");
        } else if (x>=36 && x<=50){
            System.out.print("Число попало в интервал [36-50]");
        } else if (x>=51 && x<=100){
            System.out.print("Число попало в интервал [51-100]");
        } else {
            System.out.print("Ваше число боьше 100 или меньше нуля");
        }
    }
}

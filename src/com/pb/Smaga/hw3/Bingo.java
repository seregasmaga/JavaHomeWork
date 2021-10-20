package com.pb.Smaga.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число от 1 до 100");
        System.out.println("Для выхода из программы введите - ноль");
        int x = (int) (Math.random() * 101);
        int y;
        int attempt = 0;           // Счетчик попыток.
        Scanner in = new Scanner(System.in);
        y = in.nextInt();
        while (x != y) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            y = in.nextInt();
            if (y == 0) {
                break;
            }
            if (y > x) {
                System.out.println("Вы ввели число больше загаданного");
                continue;
            }
            if (y < x) {
                System.out.println("Вы ввели число меньше загаданного");
                continue;
            }
            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }
        System.out.println("Конец игры!");
    }
}

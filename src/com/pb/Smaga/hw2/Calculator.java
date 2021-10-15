package com.pb.Smaga.hw2;
import java.util.Objects;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("Введите целое число:");
        operand1 = scan.nextInt();
        System.out.println("Введите целое число:");
        operand2 = scan.nextInt();
        System.out.println("Введите знак операции +,-,*,/:");
        sign = scan.next();
        if (Objects.equals(sign, "/")) {
            if (operand2 == 0){
                System.out.print("деление на ноль невозможно");
            }
        }
        int result;
        switch (sign) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sign);
        }
        System.out.println(operand1 + sign + operand2 + "=" + result);
    }
}

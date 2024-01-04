package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        while (true) {
            try {
                Scanner enteredValue = new Scanner(System.in);
                System.out.println("Вес, кг:");
                double weight = enteredValue.nextInt();
                System.out.println("Рост, см:");
                double height = enteredValue.nextInt();
                double bmi = service.calculate(weight, height);
                System.out.println("Ваш индекс массы тела:  " + bmi);
                if (bmi < 16) {
                    System.out.println("Выраженный дефицит массы тела");
                } else if (bmi >= 16 && bmi < 18.5) {
                    System.out.println("Недостаточная масса тела");
                } else if (bmi >= 18.5 && bmi < 25) {
                    System.out.println("Норма");
                } else if (bmi >= 25 && bmi < 30) {
                    System.out.println("Избыточная масса тела");
                } else if (bmi >= 30 && bmi < 35) {
                    System.out.println("Ожирение 1-й степени");
                } else if (bmi >= 35 && bmi < 40) {
                    System.out.println("Ожирение 2-й степени");
                } else if (bmi >= 40) {
                    System.out.println("Ожирение 3-й степени");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Пожалуйста, введите число");
            }
        }
    }
}
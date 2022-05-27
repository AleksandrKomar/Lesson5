package hometask.task2;

import java.util.Scanner;

public class Parity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое число для проверки чётности = ");

        int a = input.nextInt();

        //1 - проверим остатком от деления
        if (a % 2 == 0) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }

        //2 побитовое И
        if ((a & 1) == 0) {
            System.out.println("Число чётное.");
        } else {
            System.out.println("Число нечётное.");
        }

    }
}

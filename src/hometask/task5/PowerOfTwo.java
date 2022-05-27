package hometask.task5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число = ");

        int a = input.nextInt();

        if ((a & (a - 1)) == 0) {
            System.out.println(a + " является степенью числа 2");
        } else {
            System.out.println(a + " не является степенью числа 2");
        }
    }
}

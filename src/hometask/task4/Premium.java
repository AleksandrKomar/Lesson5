package hometask.task4;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите выслугу лет сотрудника = ");
        int year = sc.nextInt();

        System.out.print("Введите оклад сотрудника (UAH) = ");
        int salary = sc.nextInt();

        calculatePremium(year, salary);
    }

    static void calculatePremium(int year, int money) {

        int premium;

        if (year >= 0 && year < 5) {
            premium = money * 10 / 100;
            System.out.println("Премия составит 10% от зарплаты и = " + premium + " UAH");
        } else if (year >= 5 && year < 10) {
            premium = money * 15 / 100;
            System.out.println("Премия составит 15% от зарплаты и = " + premium + " UAH");
        } else if (year >= 10 && year < 15) {
            premium = money * 25 / 100;
            System.out.println("Премия составит 25% от зарплаты и = " + premium + " UAH");
        } else if (year >= 15 && year < 20) {
            premium = money * 35 / 100;
            System.out.println("Премия составит 35% от зарплаты и = " + premium + " UAH");
        } else if (year >= 20 && year < 25) {
            premium = money * 45 / 100;
            System.out.println("Премия составит 45% от зарплаты и = " + premium + " UAH");
        } else if (year >= 25) {
            premium = money * 50 / 100;
            System.out.println("Премия составит 50% от зарплаты и = " + premium + " UAH");
        }
    }
}

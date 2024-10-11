package Tasks;

import java.util.Scanner;

public class Task_2_13 {
    public static void main(String[] args) {

        // Дано трехзначное число

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести трехзначное число: ");
        int number = scanner.nextInt();

        // Найти число, полученное при прочтении его цифр справа на лево

        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;

        /*
        int num1 = number % 10;
        number /= 10;
        int num2 = number % 10;
        number /= 10;
        int num3 = number % 10;
        */

        // Формируем перевернутое число

        int reversedNumber = num3 * 100 + num2 * 10 + num1;
        System.out.println("Число в обратно порядке: " + reversedNumber);

        scanner.close();

    }
}

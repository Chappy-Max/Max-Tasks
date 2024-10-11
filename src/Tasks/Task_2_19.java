package Tasks;

import java.util.Scanner;

public class Task_2_19 {
    public static void main(String[] args) {

        // Дано четырехзначное число

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести четырехзначное число: ");
        int number = scanner.nextInt();

        int num1 = number % 10;
        number /= 10;
        int num2 = number % 10;
        number /= 10;
        int num3 = number % 10;
        number /= 10;
        int num4 = number % 10;

        // Находим сумму его цифр

        int sum = num1 + num2 +  num3 + num4;
        System.out.println("Сумма его цифр: " + sum);

        // Находим произведение его цифр

        int composition = num1 * num2 *  num3 * num4;
        System.out.println("Произведение его цифр: " + composition);

        scanner.close();

    }
}

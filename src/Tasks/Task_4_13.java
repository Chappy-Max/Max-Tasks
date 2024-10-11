package Tasks;

import java.util.Scanner;

public class Task_4_13 {
    public static void main(String[] args) {

        // Даны вещественные числа a, b, c (a != 0)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести число (a): ");
        double number1 = scanner.nextDouble();
        System.out.print("Ввести число (b): ");
        double number2 = scanner.nextDouble();
        System.out.print("Ввести число (с): ");
        double number3 = scanner.nextDouble();

        // Выяснить, имеет ли уравнение a * x^2 + b * x + c = 0 вещественные корни

        double D = number2 * number2 - 4 * number1 * number3;

        if (number1 > 0) {
            double x1 = (-number2 + Math.sqrt(D) / (2 * number1));
            double x2 = (-number2 - Math.sqrt(D) / (2 * number1));
            System.out.println("Уравнение имеет вещественные корни");
        } else {
            System.out.println("Уравнение не имеет вещественных корней");
        }

        scanner.close();

    }
}
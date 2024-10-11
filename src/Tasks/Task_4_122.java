package Tasks;

import java.util.Scanner;

public class Task_4_122 {
    public static void main(String[] args) {

        // Даны вещественные положительные числа a, b, c

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину стороны a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите длину стороны b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите длину стороны с: ");
        double c = scanner.nextDouble();

        // Выяснить, существует ли треугольник со сторонами a, b, c

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник со сторонами a, b, c существует");
        } else {
            System.out.println("Треугольник со сторонами a, b, c не существует");
        }

        scanner.close();

    }
}

package Tasks;

import java.util.Scanner;

public class Task_4_10 {
    public static void main(String[] args) {

        // Даны радиус круга и сторона квадрата

        Scanner scanner = new Scanner(System.in);
        System.out.print("R (радиус круга) = ");
        double radius = scanner.nextDouble();
        System.out.print("a (сторона квадрата) = ");
        double side = scanner.nextDouble();

        // Ищем площадь круга по формуле S = PI * a^2

        double sCircle = Math.PI * radius * radius;

        // Ищем площадь квадрата по формуле S = a * a

        double sSquare = side * side;

        // Ищем чья площадь больше

        if (sCircle > sSquare) {
            System.out.println("Площадь круга больше");
        } else if (sCircle < sSquare) {
            System.out.println("Площадь квадрата больше");
        } else {
            System.out.println("Площади фигур равны");
        }

        scanner.close();

    }
}

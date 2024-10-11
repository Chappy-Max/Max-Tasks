package Tasks;

import java.util.Scanner;

public class Task_4_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Скорость в км/ч: ");
        double km = scanner.nextDouble();
        System.out.print("Скорость в м/с: ");
        double mc = scanner.nextDouble();

        double km1 = mc * 3.6; // м/с переводим в км/ч

        // Какая из скоростей больше?

        if (km > km1) {
            System.out.println("Скорость в км/ч больше " + km);
        } else if (km < km1) {
            System.out.println("Скорость в м/c больше " + km1);
        } else {
            System.out.println("Скорости равны: " + km + " = " + km1);
        }

        scanner.close();

    }
}

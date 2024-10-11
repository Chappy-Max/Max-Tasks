package Tasks;

import java.util.Scanner;

public class Task_4_36 {
    public static void main(String[] args) {

        // Дано вещественное число t (время в минутах)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение t (время в минутах): ");
        double timeMinutes = scanner.nextDouble();

        // Определить, сигнал какого цвета горит для пешеходов в этот момент

        timeMinutes = timeMinutes % 5;

        if (timeMinutes >= 0 & timeMinutes < 3) {
            System.out.println("Горит зелёный сигнал");
        } else if (timeMinutes >= 3 && timeMinutes < 5) {
            System.out.println("Горит красный сигнал");
        }

        scanner.close();

    }
}


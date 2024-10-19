package Tasks_13_10_2024;

import java.util.Scanner;

public class Task_7_26 {
    public static void main(String[] args) {

        // 7.26. Известны данные о температуре воздуха в течение месяца. Определить, сколько раз температура опускалась ниже 0 С.

        Scanner scanner = new Scanner(System.in);

        int daysInMonth = 30;
        int daysZero = 0;

        for (int day = 1; day <= daysInMonth ; day++) {
            System.out.print("Введите температуру " + day + " день: ");
            int temperature = scanner.nextInt();

            if (temperature < 0) {
                daysZero++;
            }
        }
        System.out.println("Кол-во дней с температурой ниже 0: " + daysZero);
    }
}

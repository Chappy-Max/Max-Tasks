package Tasks_13_10_2024;

import java.util.Scanner;

public class Task_7_56 {
    public static void main(String[] args) {

        // 7.56. Известны расстояния от Москвы до нескольких городов. Найти расстояние от Москвы до самого удаленного от нее города из представленных в списке городов.

        Scanner scanner = new Scanner(System.in);

        int distantCity = 0;

        String[] city = {"Воронежа", "Сочи", "Казани", "Крыма", "Волгограда"};

        for (int i = 0; i < city.length; i++) {
            System.out.print("Введите расстояние от Москвы до " + city[i] + ": ");
            int distance = scanner.nextInt();

            if (distance > distantCity) {
                distantCity = distance;
            }
        }
        System.out.println("Самое большое расстояние от Москвы составляет: " + distantCity);
    }
}

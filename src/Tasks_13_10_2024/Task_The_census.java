package Tasks_13_10_2024;

import java.util.Scanner;

public class Task_The_census {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество жильцов: ");
        int numberOfResidents = scanner.nextInt();

        int maxAge = 0;
        int id = 0;

        for (int i = 0; i < numberOfResidents; i++) {
            System.out.print("Возраст жильца: ");
            int age = scanner.nextInt();
            System.out.println("Пол жильца (М - 1, Ж - 0): ");
            int floor = scanner.nextInt();

            if (floor == 1 && maxAge < age) {
                maxAge = age;
                id = i + 1;
            }
        }

        if (id == 0) {
            System.out.println(-1);
        } else {
            System.out.println(id);
        }
    }
}

package Tasks_13_10_2024;

import java.util.Scanner;

public class Task_Watermelons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество арбузов: ");
        int N = scanner.nextInt();

        int maxWeight = Integer.MIN_VALUE;
        int minWeight = Integer.MAX_VALUE;

        for (int i = 0; i < N ; i++) {
            System.out.print("Введите массу арбуза: ");
            int watermelonWeight = scanner.nextInt();

            if (minWeight > watermelonWeight) {
                minWeight = watermelonWeight;
            }
            if (maxWeight < watermelonWeight) {
                maxWeight = watermelonWeight;
            }
        }
        System.out.println("Арбуз потяжелее: " + maxWeight);
        System.out.println("Арбуз полегче: " + minWeight);
    }
}

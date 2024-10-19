package Tasks_13_10_2024;

import java.util.Scanner;

public class Task_5_28_а_and_г {
    public static void main(String[] args) {

        // 5.28. Найти: а) произведение всех целых чисел от 8 до 15

        int proizvedenieNum = 1;

        for (int i = 8; i <= 15 ; i++) {
            proizvedenieNum *= i;
        }
        System.out.println("Произведение всех целых чисел от 8 до 15: " + proizvedenieNum);

        // 5.28. Найти: г) произведение всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b >= a)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();

        int proizvedenieNum1 = 1;

        if (b <= a) {
            System.out.println("Ошибка: переменная b должна быть равна или больше переменной a");
            return;
        }

        for (int i = a; i <= b ; i++) {
            proizvedenieNum1 *= i;
        }
        System.out.println("Произведение всех целых чисел от a до b: " + proizvedenieNum1);
    }
}

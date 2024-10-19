package Tasks_13_10_2024;

import java.util.Scanner;

public class Task_5_27_a_and_г {
    public static void main(String[] args) {

        // 5.27. Найти: а) сумму всех целых чисел от 100 до 500

        int sum = 0;

        for (int i = 100; i <= 500 ; i++) {
            sum += i;
        }
        System.out.println("Сумма всех целых чисел от 100 до 500: " + sum);

        // 5.27. Найти: г) сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b >= a)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();

        int sum2 = 0;


        if (b <= a) {
            System.out.println("Ошибка: переменная b должна быть равна или больше переменной a");
            return;
        }

        for (int i = a; i <= b ; i++) {
            sum2 += i;
        }
        System.out.println("Сумму всех целых чисел от a до b: " + sum2);
    }
}

package Tasks_13_10_2024;

import java.util.Scanner;

public class Task_6_21 {
    public static void main(String[] args) {

        /*
        Последовательность Фибоначчи образуется так: первый и второй члены последовательности равны 1, каждый следующий равен сумме двух предыдущих (1, 1, 2, 3, 5, 8, 13, ...). Найти:
        а) первое число в последовательности Фибоначчи, большее n (значение n вводится с клавиатуры; n > 1);
        б) сумму всех чисел в последовательности Фибоначчи, которые не превосходят 1000.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n (n > 1): ");
        int n = scanner.nextInt();

        int fib1 = 1;
        int fib2 = 1;
        int nextFib = 1;

        if (n < 1) {
            System.out.println("Значение n должно быть больше 1");
            return;
        }

        while (nextFib <= n) {
            nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }
        System.out.println("Первое число в последовательности Фибоначчи, больше " + n + ": " + nextFib);

        int sum = fib1 + fib2;

        while (nextFib <= 1000) {
            nextFib = fib1 + fib2;
            if (nextFib > 1000) {
                break;
            }
            sum += nextFib;
            fib1 = fib2;
            fib2 = nextFib;
        }
        System.out.println("Cумма всех чисел в последовательности Фибоначчи, которые не превосходят 1000: " + sum);
        scanner.close();
    }
}

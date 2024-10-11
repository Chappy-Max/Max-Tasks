package Tasks;

import java.util.Scanner;

public class Task_4_97 {
    public static void main(String[] args) {

        // Даны три различных целых числа

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        int num3 = scanner.nextInt();

        // Самое большое число

        int numBig;

        if (num1 > num2 && num1 > num3) {
            numBig = num1;
        } else if (num2 > num1 && num2 > num3) {
            numBig = num2;
        } else {
            numBig = num3;
        }

        // Самое маленькое число

        int numLittle;

        if (num1 < num2 && num1 < num3) {
            numLittle = num1;
        } else if (num2 < num1 && num2 < num3) {
            numLittle = num2;
        } else {
            numLittle = num3;
        }

        // Среднее число

        int numAverage;

        if (num1 < numBig && num1 > numLittle) {
            numAverage = num1;
        } else if (num2 < numBig && num2 > numLittle) {
            numAverage = num2;
        } else {
            numAverage = num3;
        }

        System.out.println("Самое большое число: " + numBig);
        System.out.println("Самое маленькое число: " + numLittle);
        System.out.println("Среднее число: " + numAverage);

        scanner.close();

    }
}

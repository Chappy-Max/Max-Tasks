package Tasks;

import java.util.Scanner;

public class Enya {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Присвойте значение N: ");
        int N = scanner.nextInt();
        System.out.print("Присвойте значение A: ");
        int A = scanner.nextInt();
        System.out.print("Присвойте значение B: ");
        int B = scanner.nextInt();

        int weightSulfideNanograms = 2 * A * B * N;
        System.out.println("Вес необходимый для обработки сульфида тория в нанограммах: " + weightSulfideNanograms);

        scanner.close();

    }
}

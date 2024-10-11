package Tasks;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести значение A: ");
        int A = scanner.nextInt();
        System.out.print("Ввести значение B: ");
        int B = scanner.nextInt();
        System.out.print("Ввести значение С: ");
        int C = scanner.nextInt();

        if (A * B == C) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();

    }
}

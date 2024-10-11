package Tasks;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число K: ");
        int K = scanner.nextInt();

        int K1 = 9 - K;
        System.out.printf("%d9%d", K, K1);

        scanner.close();

    }
}

package Tasks_13_10_2024;


import java.util.Scanner;

public class Task_Bus_tour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во мостов N: ");
        int N = scanner.nextInt();
        int busHeight = 437;
        boolean noCrashed = false;

        for (int i = 0; i < N ; i++) {
            System.out.print("Введите высоту моста " + (i + 1) + ": ");
            int bridgeHeight = scanner.nextInt();

            if (bridgeHeight <= busHeight) {
                System.out.println("Crash " + (i + 1));
                noCrashed = true;
                break;
            }
        }

        if (!noCrashed) {
            System.out.println("No crash");
        }

    }
}

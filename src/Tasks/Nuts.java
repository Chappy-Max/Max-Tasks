package Tasks;

import java.util.Scanner;

public class Nuts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Присвойте значение N: ");
        int N = scanner.nextInt();
        System.out.print("Присвойте значение M: ");
        int M = scanner.nextInt();
        System.out.print("Присвойте значение K: ");
        int K = scanner.nextInt();

        if (N + M >= K) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        scanner.close();

    }
}

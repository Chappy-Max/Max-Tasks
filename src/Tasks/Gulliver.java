package Tasks;

import java.util.Scanner;

public class Gulliver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Присвойте значение K: ");
        int K = scanner.nextInt();
        System.out.print("Присвойте значение M: ");
        int M = scanner.nextInt();

        // Ищем кол-во матрацев лилипутов

        int quantityMattress = K * K * M;
        System.out.println("Кол-во матрацев лилипутов: " + quantityMattress);

        scanner.close();

    }
}

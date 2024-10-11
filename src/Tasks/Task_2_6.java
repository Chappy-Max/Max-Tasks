package Tasks;

import java.util.Scanner;

public class Task_2_6 {
    public static void main(String[] args) {

        // С начало суток прошло n секунд

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести кол-во секунд (n): ");
        int n = scanner.nextInt();

        // Сколько полных часов прошло с начала суток

        int hour = n/3600; // в одном часе 60 минут или 3600 секунд
        System.out.println("С начала суток прошло " + hour + " полных часов");

        // Сколько полных минут прошло с начала очередного часа

        int minutes = (n % 3600) / 60; // second % 3600 - остаток от деления означат сколько секунд прошло с начала последнего часа, потом мы вычисляем полных минут - / 60 секунд = 1 мин
        System.out.println("С начала очередного часа прошло " + minutes + " полных минут");

        // Сколько полных секунд прошло с начала очередной минуты

        int seconds = n % 60; // n - кол-во секунд % 60 секунд
        System.out.println("С начала очередной минуты прошло " + seconds + " полных секунд");

        scanner.close();

    }
}

package Tasks_13_10_2024;

import java.util.Scanner;

public class Task_Arrival_time {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int departureTimeHours = 10;
        int departureTimeMinutes = 50;
        System.out.println(String.format("%d:%d - время отправления", departureTimeHours,departureTimeMinutes));

        System.out.print("Время в пути (часы): ");
        int travelTimeHours = scanner.nextInt();
        System.out.print("Время в пути (минуты): ");
        int travelTimeMinutes = scanner.nextInt();

        int arrivalTimeInHours = departureTimeHours + travelTimeHours;
        int arrivalTimeInMinutes = departureTimeMinutes + travelTimeMinutes;

        if (arrivalTimeInMinutes > 59) {
            arrivalTimeInHours++;
            arrivalTimeInMinutes -= 59;
        }

        if (arrivalTimeInHours > 23) {
            arrivalTimeInHours %= 23;
        }
        System.out.println(String.format("Время прибытия поезда на конечную станцию - %d:%d", arrivalTimeInHours, arrivalTimeInMinutes));
    }
}

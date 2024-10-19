package Tasks_13_10_2024;

public class Task_5_8 {
    public static void main(String[] args) {

        // 5.8. Напечатать таблицу соответствия между весом в фунтахи весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).

        int fynt = 453;
        int znachenie = 0;

        for (int i = 1; i <= 10 ; i++) {
            znachenie = i * fynt;
            System.out.println(String.format("%d фунт/ов = %d г", i, znachenie));
        }
    }
}

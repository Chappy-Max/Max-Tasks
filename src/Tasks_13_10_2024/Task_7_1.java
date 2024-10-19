package Tasks_13_10_2024;

public class Task_7_1 {
    public static void main(String[] args) {

        // 7.1. Вывести на экран все целые числа от 100 до 200, кратные трем.

        for (int i = 100; i <= 200 ; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

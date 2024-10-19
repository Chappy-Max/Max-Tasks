package Tasks_13_10_2024;

public class Task_5_72 {
    public static void main(String[] args) {

        // 5.72. Начав тренировки, лыжник в первый день пробежал 10 км. Каждый следующий день он увеличивал пробег на 10% от пробега предыдущего дня. Определить:
        // а) пробег лыжника за второй, третий, ..., десятый день тренировок
        // б) какой суммарный путь он пробежал за первые 7 дней тренировок

        double distance = 10.0;
        double added = 1.1;
        double Day7 = distance;

        System.out.println("1 день - " + distance + " км");

        for (int day = 2; day <= 10; day++) {
            distance *= added;
            System.out.println(String.format("%d день - %.2f км",day, distance));

            if (day <= 7) {
                Day7 += distance;
            }
        }
        System.out.println(String.format("За первые 7 дней тренировок лыжник пробежал: %.2f км", Day7));
    }
}

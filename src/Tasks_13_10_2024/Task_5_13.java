package Tasks_13_10_2024;

public class Task_5_13 {
    public static void main(String[] args) {

        // 5.13. Напечатать таблицу умножения на 7: 1 x 7 = 7 ... 9 x 7 = 63

        int num = 7;
        int proizvedenieNum = 1;

        for (int i = 1; i <= 9 ; i++) {
            proizvedenieNum = i * num;
            System.out.println(String.format("%d x %d = %d", i, num, proizvedenieNum));


        }

    }
}

package Tasks_13_10_2024;

public class Task_8_1 {
    public static void main(String[] args) {

        int num = 5;  // a)

        for (int i = 0; i <= 3 ; i++) { // вертикаль
            for (int j = 0; j <= 4  ; j++) { // горизонталь
                System.out.print(num + " ");
            }
            System.out.println(num + " ");
        }

        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int startNum = 41;
        int endNum = 80;

        for (int i = startNum; i <= endNum ; i += 10) {
            for (int j = i; j < i + 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

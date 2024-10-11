package Tasks;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Зарплата первого работника: ");
        int salary1 = scanner.nextInt();
        System.out.print("Зарплата второго работника:");
        int salary2 = scanner.nextInt();
        System.out.print("Зарплата третьего работника:");
        int salary3 = scanner.nextInt();

        int salaryBig;
        
        if (salary1 > salary2 && salary1 > salary3) {
            salaryBig = salary1;
        } else if (salary2 > salary1 && salary2 > salary3) {
            salaryBig = salary2;
        } else {
            salaryBig = salary3;
        }

        int salaryLittle;

        if (salary1 < salary2 && salary1 < salary3) {
            salaryLittle = salary1;
        } else if (salary2 < salary1 && salary2 < salary3) {
            salaryLittle = salary2;
        } else {
            salaryLittle= salary3;
        }

        int difference = salaryBig - salaryLittle;
        System.out.println("Разницу между максимальной и минимальной зарплатой: " + difference);

        scanner.close();

    }
}

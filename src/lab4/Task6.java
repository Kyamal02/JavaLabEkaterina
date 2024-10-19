package lab4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод целого числа X
        System.out.print("Введите целое число X: ");
        int x = scanner.nextInt();
        int y;

        // Проверка на четность X
        if (x % 2 == 0) {
            y = x / 2; // Если X четное, Y равен половине X
        } else {
            y = x * 2; // Если X нечетное, Y равен удвоенному X
        }

        // Вывод значения Y
        System.out.println("Значение Y: " + y);
    }
}

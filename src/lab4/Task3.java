package lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел x и y
        System.out.print("Введите целое число x: ");
        int x = scanner.nextInt();

        System.out.print("Введите целое число y: ");
        int y = scanner.nextInt();

        // Проверка, делится ли x на y без остатка
        if (y != 0 && x % y == 0) {
            int result = x / y; // Если делится, делим x на y
            System.out.println("Число x делится на y. Результат: " + result);
        } else {
            System.out.println("Число x не делится на y без остатка.");
        }
    }
}

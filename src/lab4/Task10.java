package lab4;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод целого числа x
        System.out.print("Введите целое число x: ");
        int x = scanner.nextInt();

        int y; // Переменная y, значение которой будет определяться условием

        // Проверка, делится ли x на 5 без остатка
        if (x % 5 == 0) {
            y = 100; // Если делится, присваиваем y значение 100
        } else {
            y = 500; // Если не делится, присваиваем y значение 500
        }

        // Вывод значения y
        System.out.println("Значение y: " + y);
    }
}

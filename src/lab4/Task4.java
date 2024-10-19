package lab4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений x и k
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение k: ");
        double k = scanner.nextDouble();

        // Проверка, что k не равно нулю (чтобы избежать деления на ноль)
        if (k == 0) {
            System.out.println("k не должно быть равно нулю.");
            return;
        }

        // Вычисление выражения sin(tg(2 * Math.PI * x / k))
        double expression = Math.sin(Math.tan(2 * Math.PI * x / k));

        // Проверка на неотрицательность выражения
        if (expression >= 0) {
            k *= 3; // Если выражение неотрицательное, k утроить
            System.out.println("Выражение неотрицательное. Новое значение k: " + k);
        } else {
            System.out.println("Выражение отрицательное. Значение k не изменилось: " + k);
        }
    }
}


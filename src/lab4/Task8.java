package lab4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений n, m и t
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();

        System.out.print("Введите значение m: ");
        int m = scanner.nextInt();

        System.out.print("Введите значение t: ");
        int t = scanner.nextInt();

        // Вычисление 2^n и 2 * m
        double powerOfTwo = Math.pow(2, n);
        int doubleM = 2 * m;

        // Сравнение 2^n и 2m
        if (powerOfTwo > doubleM) {
            t += 10; // Если 2^n больше, увеличиваем t на 10
        } else {
            t /= 2; // В противном случае уменьшаем t в два раза
        }

        // Вывод модифицированного значения t
        System.out.println("Новое значение t: " + t);
    }
}

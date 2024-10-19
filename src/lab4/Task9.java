package lab4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений m и n
        System.out.print("Введите значение m: ");
        double m = scanner.nextDouble();

        System.out.print("Введите значение n: ");
        double n = scanner.nextDouble();

        // Проверка, что m и n не равны
        if (m == n) {
            System.out.println("Числа m и n должны быть неравными.");
            return;
        }

        // Вычисление значений дробей m/n и n/m
        double fraction1 = m / n;
        double fraction2 = n / m;

        // Значение числа π
        double pi = Math.PI;

        // Определение, какая из дробей ближе к π
        if (Math.abs(fraction1 - pi) < Math.abs(fraction2 - pi)) {
            m *= 2; // Если m/n ближе к π, удваиваем m
            System.out.printf("Дробь m/n ближе к π. Новое значение m: %.2f\n", m);
        } else {
            n *= 2; // Если n/m ближе к π, удваиваем n
            System.out.printf("Дробь n/m ближе к π. Новое значение n: %.2f\n", n);
        }
    }
}

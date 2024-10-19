package lab4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод целых чисел X и Y
        System.out.print("Введите целое число X: ");
        int x = scanner.nextInt();

        System.out.print("Введите целое число Y: ");
        int y = scanner.nextInt();

        // Ввод действительного числа Z
        System.out.print("Введите действительное число Z: ");
        double z = scanner.nextDouble();

        // Проверка, чтобы Y не был равен нулю (избегаем деления на ноль)
        if (y == 0) {
            System.out.println("Y не должно быть равно нулю.");
            return;
        }

        // Остаток от деления X на Y (k)
        int k = x % y;

        // Проверка условия: делится ли X на Y без остатка
        if (x % y != 0) {
            // Если X не делится на Y, Z делится на k
            z = z / k;
        } else {
            // Если X делится на Y, Z умножается на k
            z = z * k;
        }

        // Вывод модифицированного значения Z
        System.out.printf("Модифицированное значение Z: %.2f\n", z);
    }
}

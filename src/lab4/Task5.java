package lab4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод коэффициентов уравнения
        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextInt();

        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextInt();

        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextInt();

        // Вычисление дискриминанта
        double discriminant = b * b - 4 * a * c;

        // Проверка на наличие действительных корней
        if (discriminant > 0) {
            // Два действительных корня
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Корни уравнения: x1 = %.1f, x2 = %.1f", root1, root2);
        } else if (discriminant == 0) {
            // Один действительный корень
            double root = -b / (2 * a);
            System.out.printf("Уравнение имеет один корень: x = %.1f", root);
        } else {
            // Если корней нет, возводим коэффициенты в квадрат
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            System.out.printf("Уравнение не имеет действительных корней. Новые значения коэффициента: a = %.1f ", a);
        }
    }
}


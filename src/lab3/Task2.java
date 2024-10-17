package lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выводим меню с выбором простого числа
        System.out.println("Выберите одно из следующих простых чисел:");
        System.out.println("1. 2");
        System.out.println("2. 3");
        System.out.println("3. 5");
        System.out.println("4. 7");
        System.out.println("5. 11");
        System.out.println("6. 13");

        // Читаем выбор пользователя
        int choice = scanner.nextInt();
        int primeNumber;

        // Используем оператор switch для выбора простого числа
        switch (choice) {
            case 1:
                primeNumber = 2;
                break;
            case 2:
                primeNumber = 3;
                break;
            case 3:
                primeNumber = 5;
                break;
            case 4:
                primeNumber = 7;
                break;
            case 5:
                primeNumber = 11;
                break;
            case 6:
                primeNumber = 13;
                break;
            default:
                System.out.println("Неверный выбор! Пожалуйста, выберите число из списка.");
                return;
        }

        // Выводим таблицу умножения для выбранного простого числа
        System.out.println("Таблица умножения для " + primeNumber + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(primeNumber + " x " + i + " = " + (primeNumber * i));
        }
    }
}

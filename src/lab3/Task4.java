package lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод возраста пользователя
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        int category;

        // Определяем категорию на основе возраста
        if (age >= 0 && age <= 7) {
            category = 1;
        } else if (age >= 7 && age <= 18) {
            category = 2;
        } else if (age >= 18 && age <= 24) {
            category = 3;
        } else if (age >= 65) {
            category = 4;
        } else {
            category = 5; // Категория для всех остальных (без скидки)
        }

        double ticketPrice = 100.0; // Базовая стоимость билета
        double discount;

        // Используем switch для определения скидки в зависимости от категории
        switch (category) {
            case 1: // Возраст 0-7 лет
                discount = 1.0; // Скидка 100%
                break;
            case 2: // Возраст 7-18 лет
                discount = 0.7; // Скидка 70%
                break;
            case 3: // Возраст 18-24 лет
                discount = 0.5; // Скидка 50%
                break;
            case 4: // Пенсионеры (старше 65 лет)
                discount = 0.3; // Скидка 30%
                break;
            default:
                discount = 0.0; // Нет скидки для всех остальных
                break;
        }

        // Рассчитываем финальную стоимость билета с учетом скидки
        double finalPrice = ticketPrice * (1 - discount);
        System.out.printf("Стоимость билета: %.2f рублей\n", finalPrice);
    }
}

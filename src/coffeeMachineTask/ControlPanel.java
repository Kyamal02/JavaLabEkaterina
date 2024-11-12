package coffeeMachineTask;


import coffeeMachineTask.coffee.Cappuccino;
import coffeeMachineTask.coffee.Coffee;
import coffeeMachineTask.coffee.Espresso;
import coffeeMachineTask.coffee.Latte;

import java.util.Scanner;

public class ControlPanel {
    private static final Scanner scanner = new Scanner(System.in);
    private static CoffeeMachine coffeeMachine = new CoffeeMachine(500, 100, 100, true);

    // Статический массив для хранения различных видов кофе
    private static Coffee[] coffees;

    public static void main(String[] args) {
        // Инициализация массива кофе с разными типами напитков
        coffees = new Coffee[]{
                new Latte(200, 20, 150, "Латте"),
                new Espresso(50, 30, 0, "Эспрессо"),
                new Cappuccino(150, 20, 100, "Капучино")
        };

        // Запуск меню
        displayMenu();
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Выберите действие:");

        // Динамическое создание меню на основе массива кофе
        for (int i = 0; i < coffees.length; i++) {
            System.out.println((i + 1) + ". Приготовить " + coffees[i].getCoffeeName());
        }
        System.out.println((coffees.length + 1) + ". Пополнить ресурсы");
        System.out.println((coffees.length + 2) + ". Показать уровень ресурсов");
        System.out.println((coffees.length + 3) + ". Подключить кофемашину");
        System.out.println((coffees.length + 4) + ". Отключить кофемашину");
        System.out.println((coffees.length + 5) + ". Выйти");

        String choice = scanner.nextLine();

        // Проверка, является ли ввод числом

        int option = Integer.parseInt(choice);

        // Обработка выбора пользователя с помощью switch-case
        switch (option) {
            case 1:
                coffeeMachine.makeCoffee(coffees[0]);
                break;
            case 2:
                coffeeMachine.makeCoffee(coffees[1]);
                break;
            case 3:
                coffeeMachine.makeCoffee(coffees[2]);
                break;
            case 4:
                refillResources();
                break;
            case 5:
                coffeeMachine.showResources();
                break;
            case 6:
                coffeeMachine.connect();
                break;
            case 7:
                coffeeMachine.disconnect();
                break;
            case 8:
                System.out.println("Выход из программы.");
                return; // Останавливаем рекурсию, завершив метод
            default:
                System.out.println("Неверный выбор. Попробуйте снова.");
        }


        // Рекурсивный вызов метода для повторного отображения меню
        displayMenu();
    }

    private static void refillResources() {
        System.out.println("Введите количество воды для пополнения:");
        int water = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите количество зерен для пополнения:");
        int beans = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите количество молока для пополнения:");
        int milk = Integer.parseInt(scanner.nextLine());
        coffeeMachine.refill(water, beans, milk);
    }

}
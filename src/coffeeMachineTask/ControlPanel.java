package coffeeMachineTask;

import coffeeMachineTask.coffee.Coffee;
import coffeeMachineTask.coffee.Latte;

// Класс ControlPanel — интерфейс взаимодействия пользователя с кофемашиной
public class ControlPanel {
    public static void main(String[] args) {
        // Создаем кофемашину с ресурсами
        CoffeeMachine coffeeMachine = new CoffeeMachine(500, 100, 100, true);
        Coffee[] coffees = new Coffee[10];
        Latte latte = new Latte();
        coffees[0] = latte;
        /* Далее идет реализация работы с пользователем:
            1. Выбор кофе и его приготовление
            2. Пополнение машинки
            3. Можно реализовывать любой дополнительный функционал

         */
    }
    // тут так же можем реализовывать необходимые нам методы
}

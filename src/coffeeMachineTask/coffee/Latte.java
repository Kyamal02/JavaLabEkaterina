package coffeeMachineTask.coffee;

public class Latte extends Coffee {
    // у каждого типа кофе требуется разное количество воды, зерен и молока

    public Latte(int waterRequired, int beansRequired, int milkRequired, String coffeeName) {
        super(waterRequired, beansRequired, milkRequired, coffeeName);
    }
}
package coffeeMachineTask;


import coffeeMachineTask.coffee.Coffee;

public class CoffeeMachine {
    private int waterLevel; // уровень воды
    private int beansLevel; // уровень зерен
    private int milkLevel; // уровень молока
    private boolean isConnected; // подключена ли кофемашина к сети

    // Конструктор
    public CoffeeMachine(int waterLevel, int beansLevel, int milkLevel, boolean isConnected) {
        this.waterLevel = waterLevel;
        this.beansLevel = beansLevel;
        this.milkLevel = milkLevel;
        this.isConnected = isConnected;
    }

    // Метод проверки подключения
    public boolean isConnected() {
        return isConnected;
    }

    public void connect() {
        isConnected = true;
        System.out.println("Кофемашина подключена к сети.");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Кофемашина отключена от сети.");
    }

    // Проверка достаточности ресурсов
    public boolean hasEnoughResources(Coffee coffee) {
        return waterLevel >= coffee.getWaterRequired() &&
                beansLevel >= coffee.getBeansRequired() &&
                milkLevel >= coffee.getMilkRequired();
    }

    // Метод приготовления кофе
    public void makeCoffee(Coffee coffee) {
        if (!isConnected) {
            System.out.println("Кофемашина не подключена к сети!");
            return;
        }
        if (hasEnoughResources(coffee)) {
            waterLevel -= coffee.getWaterRequired();
            beansLevel -= coffee.getBeansRequired();
            milkLevel -= coffee.getMilkRequired();
            System.out.println("Приготовлено: " + coffee.getCoffeeName());
        } else {
            System.out.println("Недостаточно ресурсов для приготовления " + coffee.getCoffeeName());
        }
    }

    // Пополнение ресурсов
    public void refill(int water, int beans, int milk) {
        waterLevel += water;
        beansLevel += beans;
        milkLevel += milk;
        System.out.println("Ресурсы пополнены.");
    }

    // Получение текущего уровня ресурсов
    public void showResources() {
        System.out.println("Уровень воды: " + waterLevel + " мл");
        System.out.println("Уровень зерен: " + beansLevel + " г");
        System.out.println("Уровень молока: " + milkLevel + " мл");
    }
}
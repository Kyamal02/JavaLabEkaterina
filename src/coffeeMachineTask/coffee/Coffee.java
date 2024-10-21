package coffeeMachineTask.coffee;

// Класс Coffee — родительский класс для различных типов кофе
public class Coffee {
    private int waterRequired; // количество воды
    private int beansRequired; // количество зерен
    private int milkRequired; // количество молока
    private String coffeeName; // название кофе

    public Coffee(int waterRequired, int beansRequired, int milkRequired, String coffeeName) {
        this.waterRequired = waterRequired;
        this.beansRequired = beansRequired;
        this.milkRequired = milkRequired;
        this.coffeeName = coffeeName;
    }
    // тут если пригодиться можно определить гетеры и сеттеры
}



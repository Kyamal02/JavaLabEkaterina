package coffeeMachineTask;

// Класс CoffeeMachine — основной класс, управляющий ресурсами и процессами
public class CoffeeMachine {
    private int waterLevel; // уровень воды
    private int beansLevel; // уровень зерен
    private int milkLevel;
    private boolean isConnected; // подключена ли кофемашина к сети

    //конструктор для создания кофемашины
    public CoffeeMachine(int waterLevel, int beansLevel, int milkLevel, boolean isConnected) {
        this.waterLevel = waterLevel;
        this.beansLevel = beansLevel;
        this.milkLevel = milkLevel;
        this.isConnected = isConnected;
    }
    // тут если пригодиться можно определить гетеры и сеттеры

}

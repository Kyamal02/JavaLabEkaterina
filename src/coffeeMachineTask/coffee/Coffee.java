package coffeeMachineTask.coffee;

// Класс Coffee — родительский класс для различных типов кофе
public class Coffee {
    // тут вместо private установил модификатор доступа protected
    // он отличается тем, что можно использовать поля
    // в классах наследниках или в классах, которые находятся в одном пакете
    protected int waterRequired; // количество воды
    protected int beansRequired; // количество зерен
    protected int milkRequired; // количество молока
    protected String coffeeName; // название кофе

    public Coffee(int waterRequired, int beansRequired, int milkRequired, String coffeeName) {
        this.waterRequired = waterRequired;
        this.beansRequired = beansRequired;
        this.milkRequired = milkRequired;
        this.coffeeName = coffeeName;
    }

    // тут если пригодиться можно определить гетеры и сеттеры


    public int getWaterRequired() {
        return waterRequired;
    }

    public void setWaterRequired(int waterRequired) {
        this.waterRequired = waterRequired;
    }

    public int getBeansRequired() {
        return beansRequired;
    }

    public void setBeansRequired(int beansRequired) {
        this.beansRequired = beansRequired;
    }

    public int getMilkRequired() {
        return milkRequired;
    }

    public void setMilkRequired(int milkRequired) {
        this.milkRequired = milkRequired;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }
}
package lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод массы пользователя с клавиатуры
        System.out.print("Введите вашу массу (в кг): ");
        double userMass = scanner.nextDouble();

        // Меню для выбора планеты
        System.out.println("Выберите планету:");
        System.out.println("1. Меркурий");
        System.out.println("2. Венера");
        System.out.println("3. Земля");
        System.out.println("4. Луна");
        System.out.println("5. Марс");
        System.out.println("6. Юпитер");
        System.out.println("7. Сатурн");
        System.out.println("8. Уран");
        System.out.println("9. Нептун");
        System.out.println("10. Плутон");

        // Ввод выбора пользователя
        int choice = scanner.nextInt();
        double weightOnPlanet;

        // Используем оператор switch для расчета веса на выбранной планете
        switch (choice) {
            case 1: // Меркурий
                weightOnPlanet = userMass * 0.38;
                break;
            case 2: // Венера
                weightOnPlanet = userMass * 0.91;
                break;
            case 3: // Земля
                weightOnPlanet = userMass; // На Земле вес остается тем же
                break;
            case 4: // Луна
                weightOnPlanet = userMass * 0.165;
                break;
            case 5: // Марс
                weightOnPlanet = userMass * 0.38;
                break;
            case 6: // Юпитер
                weightOnPlanet = userMass * 2.34;
                break;
            case 7: // Сатурн
                weightOnPlanet = userMass * 1.06;
                break;
            case 8: // Уран
                weightOnPlanet = userMass * 0.92;
                break;
            case 9: // Нептун
                weightOnPlanet = userMass * 1.19;
                break;
            case 10: // Плутон
                weightOnPlanet = userMass * 0.06;
                break;
            default:
                System.out.println("Неверный выбор!");
                return;
        }

        // Выводим вес пользователя на выбранной планете
        System.out.printf("Ваш вес на выбранной планете: %.2f кг\n", weightOnPlanet);
    }
}

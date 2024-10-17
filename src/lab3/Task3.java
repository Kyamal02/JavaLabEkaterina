package lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spaceCount = 0;

        System.out.println("Введите символы (введите '.' для завершения):");

        while (true) {
            char ch = scanner.next().charAt(0);

            // Если введена точка, выходим из цикла
            if (ch == '.') {
                break;
            }

            // Если введен пробел, увеличиваем счетчик
            if (ch == ' ') {
                spaceCount++;
            }
        }

        // Выводим количество пробелов
        System.out.println("Количество пробелов: " + spaceCount);
    }
}


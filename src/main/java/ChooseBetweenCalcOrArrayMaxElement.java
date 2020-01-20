import java.util.Scanner;

/**
 * Программа должна выполнять одно из заданий на выбор.
 * Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */

public class ChooseBetweenCalcOrArrayMaxElement {
    public static void main(String[] args) {
        chooseClass();
    }

    private static void chooseClass() {
        System.out.println("Введите 1 или 2 (1 - Калькулятор, 2 - Поиск в максимального элемента в массиве): ");
        int chooseYourClass = new Scanner(System.in).nextInt();
        switch (chooseYourClass) {
            case 1:
                Calculator.main();
                break;
            case 2:
                SearchMaxElementInArray.main();
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                chooseClass();
        }
    }
}

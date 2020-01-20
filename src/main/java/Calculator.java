import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 */

public class Calculator {
    static Scanner scanInput = new Scanner(System.in);

    public static void main() {
        System.out.println("Результат операции: " + calculate(getFloat(), getFloat(), getOperation()));
    }

    private static float getFloat() {
        System.out.println("Введите число:");

        String inputString = scanInput.nextLine();

        if (Pattern.compile("^([+-]?\\d+[.,]?\\d*)$").matcher(inputString).matches()) {
            if (inputString.contains(",")) {
                inputString = inputString.replace(",", ".");
            }
            return Float.parseFloat(inputString);
        }
        else {
            System.out.println("Число не распознано! ");
            return getFloat();
        }
    }

    private static char getOperation() {
        System.out.println("Введите операцию (+,-,/,*): ");
        char operation;
        if(scanInput.hasNext()) {
            operation = scanInput.next().charAt(0);
        } else {
            System.out.println("Ошибка! Введите операцию еще раз: ");
            scanInput.next();
            operation = getOperation();
        }
        return operation;
    }

    private static float calculate(float num1, float num2, char operation) {
        float result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calculate(num1, num2, getOperation());
        }
        return result;
    }
}

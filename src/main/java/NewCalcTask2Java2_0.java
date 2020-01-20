import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * NewCalcTask2Java2_0 запрашивает 2 дробных числа на ввод, суммирует их, далее (* - по задаче) предлагает выбрать другую операцию.
 * для выбора другой операции нужно ввести 2 дробных числа.
 *
 * @param inputString введенное дробное число для операции
 * @param operation   параметр ввода операции (+,-,/,*)
 * @see #calculate(float, float, char)
 * @author Евгений Киселев
 * @return result - возвращает результат выбранного действия с 2-мя введенными числами
 */

public class NewCalcTask2Java2_0 {
    static Scanner scanInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Результат сложения заданных чисел: %.4f \nВведите 2 числа и выберите другую операцию: ", addition(getFloat(), getFloat()));
        System.out.printf("Результат операции: %.4f", calculate(getFloat(), getFloat(), getOperation()));
    }

    private static float getFloat() {
        System.out.println("Введите дробное число:");

        String inputString = scanInput.nextLine();

        if (Pattern.compile("^([+-]?\\d+[.,]?\\d*)$").matcher(inputString).matches()) {
            if (inputString.contains(",")) {
                inputString = inputString.replace(",", ".");
            }
            return Float.parseFloat(inputString);
        } else {
            System.out.println("Число не распознано! ");
            return getFloat();
        }
    }

    private static char getOperation() {
        System.out.println("Введите операцию (+,-,/,*): ");
        char operation;
        if (scanInput.hasNext()) {
            operation = scanInput.next().charAt(0);
        } else {
            System.out.println("Ошибка! Введите операцию еще раз: ");
            scanInput.next();
            operation = getOperation();
        }
        return operation;
    }

    private static float addition(float num1, float num2) {
        return num1 + num2;
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

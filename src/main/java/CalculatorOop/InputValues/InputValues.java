package CalculatorOop.InputValues;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValues {

    private float firstValue;
    private float secondValue;
    private char operation;

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public InputValues() {
        Scanner scanInput = new Scanner(System.in);
        this.firstValue = getFloat(scanInput);
        this.secondValue = getFloat(scanInput);
        this.operation = getOperation(scanInput);
        scanInput.close();
    }

    public float getFirstValue() {
        return firstValue;
    }

    public float getSecondValue() {
        return secondValue;
    }

    private static float getFloat(Scanner scanInput) {
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
            return getFloat(scanInput);
        }
    }

    public char getOperation(Scanner scanInput) {
        System.out.println("Введите операцию (+,-,/,*): ");
        char operation;
        if(scanInput.hasNext()) {
            operation = scanInput.next().charAt(0);
            if (!(operation == '+' | operation == '-' | operation == '*' | operation == '/')) {
                System.out.println("Ошибка! Введите операцию еще раз: ");
                scanInput.next();
                operation = getOperation(scanInput);
            }
        }
        else {
            System.out.println("Ошибка! Введите операцию еще раз: ");
            scanInput.next();
            operation = getOperation(scanInput);
        }
        scanInput.close();
        return operation;
    }

}

package CalculatorOop.InputValues;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValues {

    private double firstValue;
    private double secondValue;
    private char operation;

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public InputValues(String firstValue, String secondValue, char operation) {
        this.firstValue = checkFloat(firstValue);
        this.secondValue = checkFloat(secondValue);
        this.operation = operation;
    }

    public InputValues() {
        Scanner scanInput = new Scanner(System.in);
        this.firstValue = getFloat(scanInput);
        this.secondValue = getFloat(scanInput);
        this.operation = getOperation(scanInput);
        scanInput.close();
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    private static double getFloat(Scanner scanInput) {
        System.out.println("Введите число:");
        return checkFloat(scanInput.nextLine());
    }

    private static double checkFloat(String inputString) {
        if (Pattern.compile("^([+-]?\\d+[.,]?\\d*)$").matcher(inputString).matches()) {
            if (inputString.contains(",")) {
                inputString = inputString.replace(",", ".");
            }
            return Float.parseFloat(inputString);
        }
        else {
            System.out.println("Число не распознано! ");
            return checkFloat(inputString);
        }
    }
    public char getOperation(Scanner scanInput) {
        System.out.println("Введите операцию (+,-,/,*): ");
        char operation = '\0';
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

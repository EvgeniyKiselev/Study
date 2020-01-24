package CalculatorOop;

import CalculatorOop.InputValues.InputValues;
import CalculatorOop.Operations.Addition;
import CalculatorOop.Operations.Division;
import CalculatorOop.Operations.Multiplication;
import CalculatorOop.Operations.Subtraction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcOOP {

    public static void main(String[] args) {
        InputValues inputValues = new InputValues("18.55","9",'+');
        try {
            switch (inputValues.getOperation()) {
                case '+':
                    System.out.printf("Результат операции: %.4f", new Addition().sum(inputValues.getFirstValue(), inputValues.getSecondValue()));
                    break;
                case '-':
                    System.out.printf("Результат операции: %.4f", new Subtraction().sub(inputValues.getFirstValue(), inputValues.getSecondValue()));
                    break;
                case '*':
                    System.out.printf("Результат операции: %.4f", new Multiplication().multiplicate(inputValues.getFirstValue(), inputValues.getSecondValue()));
                    break;
                case '/':
                    try {
                        if (inputValues.getSecondValue() != 0) {
                            System.out.printf("Результат операции: %.4f", new Division().div(inputValues.getFirstValue(), inputValues.getSecondValue()));
                        }
                        else {
                            System.err.println("Нельзя делить на ноль.");
                        }
                    }
                    catch (ArithmeticException ex) {
                        ex.printStackTrace();
                    }
                    break;
                default:
                    System.err.println("Операция не распознана. Повторите ввод.");
                    throw new Error();
            }
        }
        catch (ArithmeticException e) {
            System.err.println("Операция не распознана. Повторите ввод.");
        }
        catch (NumberFormatException e) {
            System.err.println("Операция не распознана. Повторите ввод.");
        }
        catch (NullPointerException e) {
            System.err.println("Операция не распознана. Повторите ввод.");
        }
    }
}

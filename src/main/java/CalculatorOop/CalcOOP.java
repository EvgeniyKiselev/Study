package CalculatorOop;

import CalculatorOop.InputValues.InputValues;
import CalculatorOop.Operations.Addition;
import CalculatorOop.Operations.Division;
import CalculatorOop.Operations.Multiplication;
import CalculatorOop.Operations.Subtraction;

import java.util.Scanner;

public class CalcOOP {

    public static void main(String[] args) {
        InputValues inputValues = new InputValues();
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
                System.out.printf("Результат операции: %.4f", new Division().div(inputValues.getFirstValue(), inputValues.getSecondValue()));
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
    }
}

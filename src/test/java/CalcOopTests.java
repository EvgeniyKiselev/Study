import CalculatorOop.CalcOOP;
import CalculatorOop.InputValues.InputValues;
import CalculatorOop.Operations.Addition;
import CalculatorOop.Operations.Division;
import CalculatorOop.Operations.Multiplication;
import CalculatorOop.Operations.Subtraction;
import org.junit.Assert;
import org.junit.Test;

public class CalcOopTests {

    @Test
    public void typeOfValueTest() {
        InputValues inputValues = new InputValues("18,55","9", '/');
        Assert.assertEquals("Ожидаемый результат не совпал с фактическим",18.55, inputValues.getFirstValue(),0.1);
    }

    @Test
    public void typeOfResult() {
        InputValues inputValues = new InputValues("18,55","9", '+');
        Assert.assertNotNull(inputValues);
        Assert.assertNotNull(inputValues.getFirstValue());
        Assert.assertNotNull(inputValues.getSecondValue());
        Assert.assertNotNull(inputValues.getOperation());
    }

    @Test
    public void additionTest() {
        InputValues inputValues = new InputValues("18.5","9", '+');
        double result = new Addition().sum(inputValues.getFirstValue(), inputValues.getSecondValue());
        Assert.assertEquals("Ожидаемый результат не совпал с фактическим", 27.5, result, 0.);
    }

    @Test
    public void substractionTest() {
        InputValues inputValues = new InputValues("18","9.9", '-');
        double result = new Subtraction().sub(inputValues.getFirstValue(), inputValues.getSecondValue());
        Assert.assertEquals("Ожидаемый результат не совпал с фактическим", 8.1000, result, 0.1);
    }

    @Test
    public void multiplicationTest() {
        InputValues inputValues = new InputValues("0.55","0.56", '*');
        double result = new Multiplication().multiplicate(inputValues.getFirstValue(), inputValues.getSecondValue());
        Assert.assertEquals("Ожидаемый результат не совпал с фактическим", 0.308, result, 0.1);
    }

    @Test
    public void divisionTest() {
        InputValues inputValues = new InputValues("18","9", '/');
        double result = new Division().div(inputValues.getFirstValue(), inputValues.getSecondValue());
        Assert.assertEquals("Ожидаемый результат не совпал с фактическим", 2.0000, result, 0.1);
    }
}

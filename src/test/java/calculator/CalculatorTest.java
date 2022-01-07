package calculator;

import exceptions.NegativeNumbersNotAllowedException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import strategy.AddingStrategyImplementation;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator(new AddingStrategyImplementation());
    }

    @Test
    public void addingTwoNumbersWithCommaDelimiter() throws NegativeNumbersNotAllowedException {
        assertEquals(calculator.add("1,2"), 3);
    }

    @Test
    public void addingTwoNumbersWithNewLineAndCommaDelimiter() throws NegativeNumbersNotAllowedException {
        assertEquals(calculator.add("1\n2"), 3);
    }

    @Test
    public void addingThreeNumbersWithCommaDelimiter() throws NegativeNumbersNotAllowedException {
        assertEquals(calculator.add("1,2,3"), 6);
    }

    @Test
    public void ifNullStringIsSendReturnZero() throws NegativeNumbersNotAllowedException {
        assertEquals(calculator.add(null), 0);
    }

    @Test
    public void sendingEmptyStringReturnZero() throws NegativeNumbersNotAllowedException {
        assertEquals(calculator.add(""), 0);
    }

    @Test
    public void addingThreeNumbersWithNewLineAndCommaDelimiter() throws NegativeNumbersNotAllowedException {
        assertEquals(calculator.add("1\n2,3"), 6);
    }

    @Test
    public void addingTwoNumbersWithCustomDelimter() throws NegativeNumbersNotAllowedException {
        assertEquals(calculator.add("//;\n1;2"), 3);
    }

    @Test
    public void passingNegativeNumberWillThrowException() {
        //  assertEquals(calculator.add("1\n-2"), 3);
        assertThrows(NegativeNumbersNotAllowedException.class, ()->{calculator.add("//;1;-2");});
    }


}
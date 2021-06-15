package guru.qa.service;

import guru.qa.service.impl.ConsoleWriter;
import guru.qa.service.mock.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorMultiTest() {
        calculator = new Calculator(new MockMultiReader(), new ConsoleWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void calculatorMinusTest() {
        calculator = new Calculator(new MockMinusReader(), new ConsoleWriter()); // 10, 3, -
        String result = calculator.start();
        Assertions.assertEquals("10 - 3 = 7", result);
    }

    @Test
    void calculatorPowTest() {
        calculator = new Calculator(new MockPowReader(), new ConsoleWriter()); // 3, 4, ^
        String result = calculator.start();
        Assertions.assertEquals("3 ^ 4 = 81", result);
    }

    @Test
    void calculatorSumTest() {
        calculator = new Calculator(new MockSumReader(), new ConsoleWriter()); // 3, 4, ^
        String result = calculator.start();
        Assertions.assertEquals("10 + 3 = 13", result);
    }

    @Test
    void calculatorDivideTest() {
        calculator = new Calculator(new MockDivideReader(), new ConsoleWriter()); // 3, 4, ^
        String result = calculator.start();
        Assertions.assertEquals("9 / 3 = 3", result);
    }
}
package guru.qa.service;

import guru.qa.service.impl.ConsoleWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static guru.qa.service.MessagesForConsole.*;

public class WriterTest {

    ConsoleWriter w = new ConsoleWriter();

    @Test
    void MessagesInputNumbersTest() {
        String actual = w.handleString(INPUT_NUMBERS.getMessages());
        Assertions.assertEquals("Введите два числа: ", actual);
    }

    @Test
    void MessagesInputOperationTest() {
        String actual = w.handleString(INPUT_OPERATION.getMessages());
        Assertions.assertEquals("Введите оператор (+, *, -, /, ^): ", actual);
    }

    @Test
    void MessagesResultTest() {
        String actual = w.handleString(RESULT.getMessages());
        Assertions.assertEquals("\nРезультат:\n", actual);
    }
}

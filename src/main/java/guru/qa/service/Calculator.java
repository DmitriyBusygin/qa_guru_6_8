package guru.qa.service;

import static guru.qa.service.MessagesForConsole.*;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(INPUT_NUMBERS.getMessages());
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString(INPUT_OPERATION.getMessages());
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        String result = first + " " + po.getSymbol() + " " + second + " = " + sum;
        writer.handleString(RESULT.getMessages() + result);
        return result;
    }
}

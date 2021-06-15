package guru.qa.service;

public enum MessagesForConsole {

    INPUT_NUMBERS("Введите два числа: "),
    INPUT_OPERATION("Введите оператор (+, *, -, /, ^): "),
    RESULT("\nРезультат:\n");

    private final String messages;

    MessagesForConsole(String messages) {
        this.messages = messages;
    }

    public String getMessages() {
        return messages;
    }
}

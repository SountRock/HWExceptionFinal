package org.example.UniqueExceptions;

/**
 * Класс основа для Исключений Неправильного Ввода
 */
public abstract class FormatException extends RuntimeException {
    String message;
    public FormatException(String message) {
        super("Format Exception - " + message);
        this.message = message;
    }

    /**
     * Метод проверки на исключение
     * @param value
     */
    public abstract void test(String value);
}

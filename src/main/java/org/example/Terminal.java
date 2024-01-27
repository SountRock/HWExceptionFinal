package org.example;
import org.example.UniqueExceptions.FormatException;
import java.util.List;

/**
 * Класс для обработки данных
 */
public class Terminal {
    List<FormatException> exceptions;
    public Terminal(List<FormatException> exceptions) {
        this.exceptions = exceptions;
    }

    /**
     * Проверяет коректно ли введены данные
     * @param value
     * @return datas
     */
    public String[] translate(String value){
        String[] datas = value.split(" ");

        try {
            testData(datas);
            return datas;
        }  catch (FormatException e){
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    /**
     * Поверяет корректность ввода
     * @param datas
     */
    private void testData(String[] datas) {
        if (datas.length < 6)
            throw new RuntimeException("few date entered");

        if (datas.length > 6)
            throw new RuntimeException("too much date entered");

        byte index = 0;
        for (String data : datas) {
            exceptions.get(index).test(data);
            index++;
        }
    }
}

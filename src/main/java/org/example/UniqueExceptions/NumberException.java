package org.example.UniqueExceptions;

public class NumberException extends FormatException {

    public NumberException() {
        super("Number Format Exception");
    }

    @Override
    public void test(String value) {
        try{
            Integer.parseInt(value);
        } catch (NumberFormatException e){
            throw new NumberException();
        }
    }
}

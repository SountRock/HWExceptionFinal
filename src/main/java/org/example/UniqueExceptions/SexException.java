package org.example.UniqueExceptions;

public class SexException extends FormatException {


    public SexException() {
        super("Sex Format Exception");
    }

    @Override
    public void test(String value) {
        value.toLowerCase();
        if (!value.equals("f") && !value.equals("m")){
            throw new SexException();
        }
    }
}

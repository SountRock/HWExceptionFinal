package org.example.UniqueExceptions;

public class NameException extends FormatException {
    public NameException() {
        super("Name Format Exception");
    }

    @Override
    public void test(String value) {
        char[] temp = value.toCharArray();
        for (char item : temp) {
            //[ ! , @ ] || [ [ , ` ] || [ { , ~ ]
            if((item > 32 && item < 65) || (item > 90 && item < 97) || (item > 123 && item < 127))
                throw new NameException();
        }
    }
}

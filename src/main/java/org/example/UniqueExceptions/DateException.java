package org.example.UniqueExceptions;

public class DateException extends FormatException {

    public DateException() {
        super("Date Format Exception");
    }

    @Override
    public void test(String value) {
        String[] date = value.split("\\.");
        if(date.length == 3) {
            if(date[0].length() != 2 || date[1].length() != 2 || date[2].length() != 4){
                throw new DateException();
            } else {
                try {
                    Integer.parseInt(date[0]);
                    Integer.parseInt(date[1]);
                    Integer.parseInt(date[2]);
                } catch (NumberFormatException e){
                    throw new DateException();
                }
            }
        } else {
            throw new DateException();
        }
    }
}

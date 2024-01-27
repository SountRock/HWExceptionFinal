package org.example;

import org.example.UniqueExceptions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<FormatException> exceptions = new ArrayList<>(Arrays.asList(
                new NameException(),
                new NameException(),
                new NameException(),
                new DateException(),
                new NumberException(),
                new SexException()
        ));

        System.out.println("Enter data:");
        Scanner scanner = new Scanner(System.in);
        Terminal terminal = new Terminal(exceptions);
        String readLine = "";
        while(true){
            readLine = scanner.nextLine();

            if(!readLine.toLowerCase().equals("exit")){
                String[] readDatas = terminal.translate(readLine);
                if(readDatas != null){
                    SaveData saveData = new SaveData(readDatas);
                    saveData.save(readDatas[1] + ".txt");
                }
            } else {
                break;
            }
        }

    }
}
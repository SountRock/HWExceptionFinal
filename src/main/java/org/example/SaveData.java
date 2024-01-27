package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс сохраняет массив данных в файл
 */
public class SaveData {
    String[] datas;

    public SaveData(String[] datas) {
        this.datas = datas;
    }

    /**
     * Метод сохранения данных по имени
     * @param fileName
     */
    public void save(String fileName) {
        try(FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            for (String data : datas) {
                bw.append(data + " ");
            }
            bw.append("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

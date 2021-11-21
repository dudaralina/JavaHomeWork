package com.pb.dudar.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    Path path = Paths.get("files\\numbers.txt");
    Path path2 = Paths.get("files\\odd-numbers.txt");

    public static void main(String[] args)throws Exception {
        Path file1 = new FileNumbers().createNumbersFile();
        Path file2 = new FileNumbers().createOddNumbersFile(file1);
    }

    //Метод 1
    public Path createNumbersFile() throws Exception {

        Random x = new Random();
        String y;

//Записываем в файл рандомные цмфры по 10 цифр в каждой строке (10 строк):
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    y = x.nextInt(99) + 1 + " ";
                    writer.write(y);
                }
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        return path;
    }


    //Метод 2
public Path createOddNumbersFile (Path path) throws Exception {

    //Записываем в новый файл:
    try (BufferedWriter writer = Files.newBufferedWriter(path2)) {
        //Считываем файл, который нужно переписать:
        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;
            while ((line = reader.readLine()) != null) {
//Разделяю строку на масив строк по пробелу, чтобы преобразовать строки в число:
                String[] ololo = line.split(" ");

                int[] st1 = new int[ololo.length];
                for (int i = 0; i < ololo.length; i++) {
                    try {
                        st1[i] = Integer.parseInt(ololo[i]);
                    } catch (Exception ex) {
                        System.out.println("Ошибка данных");
                    }
                    //отбираю парные числа и переписываю их на 0
                    if (st1[i] % 2 == 0) {
                        st1[i] = 0;
                    }
                    //записываю результат в строку нового файла
                    writer.write(st1[i] + " ");
                }
//разделяю строки на абзацы
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
    } catch (Exception ex) {
        System.out.println("Error with file write: " + ex);
    }
    return path2;
}
}


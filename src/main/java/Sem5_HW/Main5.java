package Sem5_HW;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main5 {
    public static void main(String[] args) throws IOException {

        
    }

    public static void task1(){
//        Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
//        во вновь созданную папку ./backup
        BackupFiles.backupDiretory("C:\\Users\\Dmitry\\Desktop\\java_core1\\src\\main\\java\\Sem5");
    }

    public static void task2(){
//        Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой, например,
//        состояния ячеек поля для игры в крестикинолики, где 0 – это пустое поле, 1 – это поле с крестиком,
//        2 – это поле с ноликом, 3 – резервное значение. Такое предположение позволит хранить в одном числе типа int
//        всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.
        int[] arr = {0, 1, 2, 3, 0, 1, 2, 3, 0};

        try (FileOutputStream fileOutputStream = new FileOutputStream("task_2.txt")) {
            for (int i = 0; i < 3; i ++) {
                byte write = 0;
                // Конвертируем каждые три значения в один байт и записываем их в файл
                for (int j = 0; j < 3; j++) {
                    write += (byte) (arr[3 * i + j] << (j * 2));
                }
                fileOutputStream.write(write);
            }
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task3() throws IOException {
//        Написать функцию, добавляющую префикс к каждому из набора файлов,
//        названия которых переданы ей в качестве параметров через пробел.

        String[] fileNames = {"C:\\Users\\Dmitry\\Desktop\\java_core1\\src\\main\\java\\Sem5_HW", "a.txt"};

         for (String fileName : fileNames) {
             Path file = Path.of(fileName);
             if (Files.exists(file)) {
                 Files.move(file, Paths.get("pre_" + file.getFileName()), REPLACE_EXISTING);
                 } else {
                 System.out.printf("No file with name '%s'", fileName);
                 }
             }

    }
}

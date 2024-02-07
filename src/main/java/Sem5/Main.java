package Sem5;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        task1And2();
//        task3();
//        task4();

    }

    public static void task1And2(){
        //        Создать массив из 9 цифр и записать его в файл, используя поток вывода.
        int[] intArray = new int[]{1,2,3,4,5,6,7,10};
        String fileName = "taskOne_1";

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))){
            for (Integer number : intArray){
                outputStream.writeByte(number);
                outputStream.writeByte(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Задача: Создать массив целых чисел и заполнить его информацией из файла,
//        записанного в предыдущем задании.

        try(DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName))){
            byte[] byteArr = inputStream.readAllBytes();
            int[] arr = IntStream.range(0, byteArr.length).map(i -> byteArr[i]).filter(i-> i != 0).toArray();
            System.out.println(Arrays.toString(arr));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void task3(){
        //        Задача: Написать программу заменяющую указанный символ в текстовом
        //        файле на пробел, сохраняющую получившийся текст в новый файл.
        ReplaceSymbolInFile replaceSymbolInFile = new ReplaceSymbolInFile("taskOne");
        replaceSymbolInFile.replaceChar(' ','!');

//        Задача: Модифицировать алгоритм поиска замены символа так, чтобы программа осуществляла замену слова
//        (последовательного набора символов) в исходном файле и записывала результат в новый файл

        replaceSymbolInFile.replacePhrase("2, 3", "999");

        ReplaceSymbolInFile replacePhraseInFile = new ReplaceSymbolInFile("bigFile.txt");
        long timeStart = System.currentTimeMillis();
        replacePhraseInFile.replacePhrase("Spring", "Winter");
        System.out.println("replace time: " + ((System.currentTimeMillis() - timeStart) / 1000.0));



    }

    public static void task4(){
//        Задача: Написать программу, читающую и выводящую в содержимое
//        текущей папки .

//        Задача*: Написать программу таким образом, чтобы она рекурсивно выводила содержимое не только текущей папки,
//        но и вложенных.

        ShowFilesInCurrentDir showFilesInCurrentDir = new ShowFilesInCurrentDir();
//        showFilesInCurrentDir.printFiles();

        showFilesInCurrentDir.printAllFilesRecursively();
    }


}

package Sem5;

import java.io.*;

public class ReplaceSymbolInFile {
    private String fileName;

    public ReplaceSymbolInFile(String fileName) {
        this.fileName = fileName;
    }

    public void replaceChar(char targetCaracter, char replaceCaracter){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "_replaced"))) {
            while (reader.ready()){
                char currentChar = (char) reader.read();
                if(currentChar == targetCaracter){
                    writer.write(replaceCaracter);
                }else {
                    writer.write(currentChar);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void replacePhrase (String actualWord, String target){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "_replaced_task3"))) {
            while (reader.ready()){
                String currentString = reader.readLine();
                if(currentString.contains(actualWord)){
                    writer.write(currentString.replace(actualWord, target));
                } else {
                    writer.write(currentString);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

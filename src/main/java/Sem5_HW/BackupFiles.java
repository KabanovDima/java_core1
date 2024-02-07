package Sem5_HW;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class BackupFiles {
    public static void backupDiretory(String sourceDirectory){
        File sourceDir = new File(sourceDirectory);
        if(!sourceDir.exists() || !sourceDir.isDirectory()){
            System.out.println("Указанная директория не существует или не является директорией.");
            return;
        }
        File backupDir = new File(sourceDir.getParent(), "backup");
        if(!backupDir.exists()){
            backupDir.mkdir();
        }
        File[] files = sourceDir.listFiles();
        if(files != null){
            for(File file : files){
                if(file.isFile()){
                    try {
                        Files.copy(file.toPath(), new File(backupDir, file.getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Создана резервная копия файла: " + file.getName());
                    } catch (IOException e) {
                        System.out.println("Не удалось создать резервную копию файла: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

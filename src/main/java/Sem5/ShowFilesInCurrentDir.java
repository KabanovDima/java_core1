package Sem5;

import java.io.File;
import java.util.Objects;

public class ShowFilesInCurrentDir {

    public void printFiles(){
        File file = new File(".");
        for(File f : file.listFiles()){
            System.out.println(f.getName());
        }
    }

    public void printAllFilesRecursively(){
        File file = new File(".");
        int level = 0;
        for(File f : file.listFiles()){
            diveDeep(f, level);
        }
    }

//    private File diveDeep(File currentFile, int level){
//        if(currentFile.isFile()){
//            System.out.println("  ".repeat(level) + currentFile.getName());;
//        } else {
//            diveDeep(currentFile, level + 1);
//        }
//        return null;
//    }

    private void diveDeep(File currentFile, int level) {
        if (currentFile.isFile()) {
            System.out.println(" ".repeat(level) + currentFile.getName());
        } else {
            System.out.println(" ".repeat(level) + currentFile.getName().toLowerCase() + ":");
            ++level;
            for (File file : Objects.requireNonNull(currentFile.listFiles())) {
                diveDeep(file, level);
            }
        }
    }

}

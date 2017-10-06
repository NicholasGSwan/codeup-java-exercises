package util;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHandler {
 private Path directory;
 private Path filename;
 public FileHandler(String directory,String filename){
     this.directory = Paths.get(directory);
     this.filename = Paths.get(directory, filename);
 }


    public void createFile(){
        createDirectory();
        try {
            if (Files.notExists(filename)) {
                Files.createFile(filename);
                System.out.println(filename+" file created");
            }
        } catch (Exception e) {
            System.out.println("Could not create file");
        }
    }
    public void createDirectory(){
        if(Files.notExists(directory)){
            try{
            Files.createDirectory(directory);
                System.out.println(directory +" directory created");
            }catch(Exception e){
                System.out.println("could not create directory");
            }
        }


    }

    public List<String> getFileContents(){
        //created a blank array to return if the read fails
        ArrayList<String> returnThisArray = new ArrayList<>();
        try {
            return Files.readAllLines(filename);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to read "+filename);
            return returnThisArray;
        }
    }

    public void writeFile(List<String> thingToAdd){
        try {
            Files.write(filename, thingToAdd);
        } catch (Exception e) {
            System.out.println("could not write to file");
        }
    }
    public void writeFile(List<String> thingToAdd, boolean append) {
        if (append) {
            try {
                Files.write(filename, thingToAdd, StandardOpenOption.APPEND);
            } catch (Exception e) {
                System.out.println("could not write to file");
            }
        }else{
            writeFile(thingToAdd);
        }
    }
}



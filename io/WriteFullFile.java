package io;

import java.io.*;
import java.util.ArrayList;

public class WriteFullFile {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("data/file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)){

            ArrayList<String> strings = new ArrayList<>();
            bufferedReader.lines().forEach(strings::add);
            strings.forEach(System.out::println);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

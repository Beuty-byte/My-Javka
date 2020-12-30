package io;

import java.io.*;

public class BufferFileReader {
    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("data/out.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             FileReader fileReader = new FileReader("data/file.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

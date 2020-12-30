package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderMain {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("data/file.txt");
             FileWriter fileWriter = new FileWriter("data/out.txt", true)){

            char[] chars = new char[14];
            int charNum = fileReader.read(chars);

            while (charNum != -1) {
                fileWriter.write(chars, 0, charNum);
                charNum = fileReader.read(chars);
            }




//            int simbol = fileReader.read();
//            System.out.println((char) simbol);
//            char[] chars = new char[8];
//            fileReader.skip(2);
//            fileReader.read(chars);
//            System.out.println(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        }finally {
//            try {
//                if(fileReader != null)
//                fileReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}

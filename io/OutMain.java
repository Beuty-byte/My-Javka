package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutMain {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data/out.txt",true);
            // if here put flag true file content not be delete
            fileOutputStream.write(48);

            byte[] bytes = {76,87,127,124,};

            fileOutputStream.write(bytes);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

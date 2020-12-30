package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutMain {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data/out.txt");
            fileOutputStream.write(48);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

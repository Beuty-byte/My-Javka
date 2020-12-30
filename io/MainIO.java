package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class MainIO {
    public static void main(String[] args) {
//        Properties properties = System.getProperties();
//        properties.list(System.out);

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("data/file.txt");
            int value = inputStream.read();
            System.out.println((char)value);
            byte[] bytes = new byte[16];
            int num = inputStream.read(bytes);
            System.out.println("amount read bytes " + num);
            System.out.println(Arrays.toString(bytes));
            for (byte el:bytes) {
                System.out.print(" " + (char)el);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null)
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

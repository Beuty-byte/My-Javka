package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("out.dat"))){

            

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

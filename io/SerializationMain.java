package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("data/out.dat"))){

        StudentForSerialization student = new StudentForSerialization("Andrei",14,"greee");
        //StudentForSerialization student2 = new StudentForSerialization("Sergei",11,"greee1");
        output.writeObject(student);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

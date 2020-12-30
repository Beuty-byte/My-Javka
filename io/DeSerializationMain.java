package io;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationMain {
    public static void main(String[] args) {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data/out.dat"))){

           StudentForSerialization student = (StudentForSerialization) inputStream.readObject();
            System.out.println(student);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

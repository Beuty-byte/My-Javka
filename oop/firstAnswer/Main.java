package oop.firstAnswer;

public class Main {
    public static void main(String[] args) {

        TextFile file = new TextFile();

        System.out.println(file.getFile());
        file.generate("sdf","khasdhaskdals","C:\\sadadsasd");
        System.out.println(file.getContent());
        System.out.println(file.getFileName());

        file.rename("New name");
        System.out.println(file.getFileName());

        file.getContent();

        file.supplementContent(" VAY ITS WORK");
        file.getContent();
    }
}

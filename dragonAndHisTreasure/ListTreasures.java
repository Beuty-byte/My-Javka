package dragonAndHisTreasure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTreasures {
    public static List<String> returnAllTreasure() throws FileNotFoundException {
        Scanner scanner = new Scanner(ListTreasures.connectionToFile());
        List<String> allTreasure = new ArrayList<>();
        while (scanner.hasNextLine()){
            allTreasure.add(scanner.nextLine());
        }
        return allTreasure;
    }

    private static File connectionToFile(){
        String path =  "C:\\\\Users\\Wizzi\\Desktop\\test.txt";
        return new File(path);
    }
}

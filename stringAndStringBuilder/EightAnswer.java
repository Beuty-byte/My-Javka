package stringAndStringBuilder;

import java.util.Scanner;

public class EightAnswer {
    public static void eightAnswer()
    {
        String str = inputString();
        String maxLengthWord = checkStringLength(str);
        System.out.println(maxLengthWord);
    }



    private static String checkStringLength(String str)
    {
        String[] strings = str.split("\\s");

        int max = 0;
        String maxLengthString = "";
        for (int i = 0; i < strings.length; i++) {
            if(max < strings[i].length()){
                max = strings[i].length();
                maxLengthString = strings[i];
            }
        }

        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if(max == strings[i].length()){
                count++;
            }
            if(count > 1){
                return "This case don't work :(";
            }
        }
        return maxLengthString;
    }

    private static String inputString()
    {
        System.out.println("Please enter string");
        Scanner sc = new Scanner(System.in);
        String scStr = "";
        scStr += sc.nextLine();
        return scStr;
    }
}

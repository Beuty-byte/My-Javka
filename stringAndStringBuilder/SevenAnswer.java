package stringAndStringBuilder;

import java.util.Scanner;

public class SevenAnswer {
    public static void sevenAnswer()
    {
       String str =  inputString();
       str = deleteRepeatingChar(str);
        System.out.println(str);
    }

    private static String deleteRepeatingChar(String str)
    {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if(chars[i] == chars[j]){
                    chars[j] = 32;
                }
            }
        }

        String newString = new String(chars);
        newString = newString.replaceAll("\\s+","");
        return newString;
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

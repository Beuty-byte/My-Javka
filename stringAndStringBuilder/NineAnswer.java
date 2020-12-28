package stringAndStringBuilder;

import java.util.Scanner;

public class NineAnswer {
    public static void nineAnswer()
    {
        String str = inputString();
        int[] arr = countLatter(str);

        System.out.println("Lower Case = "+ arr[0]);
        System.out.println("Upper Case = "+ arr[1]);

    }


    private static int[] countLatter(String str){
        int countLowerCase = 0;
        int countUpperCase = 0;
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                countUpperCase++;
            }
            if(chars[i] >= 'a' && chars[i] <= 'z'){
                countLowerCase++;
            }
        }
        int[] arr = {countLowerCase, countUpperCase};
        return arr;
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

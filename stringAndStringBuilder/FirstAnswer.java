package stringAndStringBuilder;

import java.util.regex.Pattern;

public class FirstAnswer {
    public static void firstAnswer()
    {
        String str = "             sd  sadasd   asd      dfffff  ";
        char[] ch = str.toCharArray();

        int count = 0;
        int maxValue = 0;

        for(int i = 0; i < ch.length;i++){
            if((int)ch[i] == 32){
                count++;
            }else {
                if(count > maxValue){
                    maxValue = count;
                }
                count = 0;
            }
        }
        System.out.println(maxValue);
        // space == 32
    }
}

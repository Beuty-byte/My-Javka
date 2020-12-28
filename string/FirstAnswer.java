package string;

import java.util.Arrays;

public class FirstAnswer {
    public static void firstAnswer(){

        String[] strArr = {"dsadqAsdd","asdrDasd","dasfasOsdad","sdqweFasd"};

        for (int i = 0; i< strArr.length;i++)
        {
           int index = checkIndexToUpperCase(strArr[i]);

           if(index != -1){
               StringBuilder stBuilder = new StringBuilder(strArr[i]);
               stBuilder.insert(index,"_");
               strArr[i] = stBuilder.toString();
               strArr[i] = strArr[i].toLowerCase();
           }
        }

        System.out.println(Arrays.toString(strArr));

    }

    private static int checkIndexToUpperCase(String str)
    {
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length;i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                return i;
            }
        }
        return -1;
    }
}

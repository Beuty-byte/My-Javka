package stringAndStringBuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SecondAnswer {
    public static void secondAnswer()
    {
        String str = "great answer";
        ArrayList<Integer> list = new ArrayList<>(checkString(str));

        StringBuilder stbuild = new StringBuilder(str);


        int offset = 0;
        for (int el:list) {
            System.out.println(el);
            stbuild.insert(el+1+offset,"b");
            offset++;
        }
        System.out.println(stbuild.toString());
    }

    private static List<Integer> checkString(String str)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        char[] ch = str.toCharArray();
        for(int i = 0;i < ch.length;i++)
        {
            if(ch[i] == 'a'){
                list.add(i);
            }
        }
        return list;
    }
}

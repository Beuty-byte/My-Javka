package decompositionUsingMethods;

import java.util.Arrays;

public class TenthAnswer {
    public static void tenthAnswer()
    {
        int n = 74123;
        int[] arr = arrayForm(n);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrayForm(int n)
    {
        String s = String.valueOf(n);
        char[] ch = s.toCharArray();
        int[] arr = new int[ch.length];

        for(int i = 0;i < arr.length;i++)
        {
            arr[i]+=ch[i]-'0';
        }

        return arr;

    }
}

package decompositionUsingMethods;

import java.util.Arrays;

public class TwelfthAnswer {
    public static void twelfthAnswer()
    {
        int k = 5559;
        int m = 100;

        int[] a = transform(k);
        int[] resultArr = new int[a.length];
        int sum = 0;


        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            if(sum > m){
                break;
            }else {
                resultArr[i] = a[i];
            }
        }

        System.out.println(Arrays.toString(resultArr));

    }
    private static int[] transform ( int a){
        String temp = Integer.toString(a);
        int[] arr = new int [temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            arr[i] = temp.charAt(i) - '0';

        }
        return arr;
    }
}

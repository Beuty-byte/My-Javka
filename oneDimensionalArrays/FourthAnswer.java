package OneDimensionalArrays;

import java.util.Arrays;

public class FourthAnswer {
    public static void fourthAnswer()
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,190};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println(min+" "+max);

        for(int i =0; i<arr.length;i++)
        {
            if(arr[i] == min)
            {
                arr[i] = max;
                continue;
            }
            if(arr[i] == max)
            {
                arr[i] = min;
                continue;
            }
        }

        System.out.println(Arrays.toString(arr));



    }
}

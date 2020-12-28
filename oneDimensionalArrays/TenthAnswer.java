package OneDimensionalArrays;

import java.util.Arrays;

public class TenthAnswer {
    public static void tenthAnswer()
    {
        int[] arr = {3,4,5,6,67,76,3,1,3,45};

        for(int i = 0; i < arr.length;i++){
            if(i%2 == 0)
            {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

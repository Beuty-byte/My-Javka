package OneDimensionalArrays;

import java.util.Arrays;

public class EighthAnswer {
    public static void eighthAnswer()
    {
        int[] arr = {12,2,3,5,6,7,2,11,2,14,2,4,5};
        int min = arr[0];
        int count = 0;

        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length;i++)
        {
            if(arr[i] == min)
            {
                count++;
            }
        }

        int[] arr2 = new int[arr.length-count];

        int indexResult = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                arr2[indexResult] = arr[i];
                indexResult++;
            }
        }

        System.out.println(Arrays.toString(arr2));
    }
}

package sorting;

import java.util.Arrays;

public class ThirdAnswer {
    public static void thirdAnswer()
    {
        int[] arr = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;


                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

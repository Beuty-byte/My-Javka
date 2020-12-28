package arraysOfArrays;

import java.util.Arrays;

public class TwelfthAnswer {
    public static void twelfthAnswer()
    {

        int[][] arr = {
                {2,4,6,9,13,2},
                {1,4,76,54,32,14},
                {54,23,34,6,554,12},
                {4,5,7,8,3,21},
                {4,65,87,12,54,33},
                {43,2,5,65,12,34},
        };




        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = bubbleSort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();

        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = reversBubbleSort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }




    }

    public static int[] bubbleSort(int[] arr)
    {
        boolean sorted = false;
        while(!sorted)
        {
            sorted = true;
            for(int i = 0; i < arr.length-1; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }return arr;
    }


    public static int[] reversBubbleSort(int[] arr)
    {
        boolean sorted = false;
        while(!sorted)
        {
            sorted = true;
            for(int i = 0; i < arr.length-1; i++)
            {
                if(arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }return arr;
    }
}

package arraysOfArrays;

import java.util.Arrays;

public class FirstAnswer {
    public static void firstAnswer()
    {
        int[][] arr = {
                {2,4,6,9,13,2},
                {1,4,76,54,32,14},
                {54,23,34,6,554,12},
                {4,5,7,8,3,21},
                {4,65,87,12,54,33},
                {43,2,5,65,12,34},
        };



        for (int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j += 2) {
                if (arr[0][j] > arr[arr.length - 1][j]) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }


    }

}

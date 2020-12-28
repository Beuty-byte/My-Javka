package arraysOfArrays;

import java.util.Arrays;

public class EleventhAnswer {
    public static void eleventhAnswer()
    {
        int string = 10;
        int column = 20;

        int[][] arr = new int[string][column];

        int a = 0;
        int b = 15;

        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                arr[i][j] = a + (int) (Math.random() * b);
                System.out.print(arr[i][j]+"\t");
            } System.out.println();
        }


        int count = 0;
        int[] maxRepeat = new int[arr[0].length];

        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                maxRepeat[j] = arr[i][j];
                if(arr[i][j] == 5)
                {
                    count++;
                }
            }

            if(count >= 3)
            {
                System.out.println(Arrays.toString(maxRepeat));
            }
            count = 0;
        }

    }
}

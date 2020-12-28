package arraysOfArrays;

public class FifteenthAnswer {
    public static void fifteenthAnswer()
    {
        int[][] arr = {
                {2,4,6,9,13,2},
                {1,4,76,54,32,14},
                {54,23,34,6,554,12},
                {4,5,7,8,3,21},
                {4,65,87,12,54,33},
                {43,2,5,65,12,34},
        };

        int max = Integer.MIN_VALUE;

        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0; j<arr[i].length;j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }

        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0; j<arr[i].length;j++)
            {
                if(arr[i][j]%2 != 0)
                {
                    arr[i][j] = max;
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

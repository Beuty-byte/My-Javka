package arraysOfArrays;

public class ThirdAnswer {
    public static void thirdAnswer()
    {
        int[][] arr = {
                {2,4,6,9,13,2},
                {1,4,76,54,32,14},
                {54,23,34,6,554,12},
                {4,5,7,8,3,21},
                {4,65,87,12,54,33},
                {43,2,5,65,12,34},
        };

        int k = 3;
        int p = 5;

        for (int i = 0; i< arr.length;i++)
        {
            for (int j = 0;j< arr[i].length;j++)
            {
                if(i == k-1)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                if(j == p-1)
                {
                    System.out.println(arr[i][p-1]);
                }
            }
        }
    }
}

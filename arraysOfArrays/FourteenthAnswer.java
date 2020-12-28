package arraysOfArrays;

public class FourteenthAnswer {
    public static void fourteenthAnswer()
    {

        int m = 5 + (int) (Math.random() * 20);
        int n = 5 + (int) (Math.random() * 20);
        System.out.println(m);
        System.out.println(n);

        int[][] arr = new int[m][n];



        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0; j < arr[i].length;j++)
            {
                if(j>i)
                {
                    arr[i][j] = 1;
                }


                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

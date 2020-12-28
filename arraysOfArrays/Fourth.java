package arraysOfArrays;

public class Fourth {
    public static void fourthAnswer()
    {
        int[][] arr = {
                {2,4,6,9,13,2},
                {1,4,76,54,32,14},
                {54,23,34,6,554,12},
                {4,5,7,8,3,21},
                {4,65,87,12,54,33},
                {43,2,5,65,12,34},
        };

        int decrement = 0;

        for(int i = 0; i < arr.length;i++)
        {
//            if(i%2 == 0)
//                continue;

        //    int[] curent = arr[i];  peredel

            for(int j = 0; j< arr[i].length;j++)
            {
// вынести проверку
            if(i%2 != 0) {
                arr[i][j] -= decrement;
                decrement++;
                if (j == arr[i].length - 1) {
                    arr[i][j] = 1;
                }
            }

                System.out.print(arr[i][j]+"\t");
            }
            decrement = 0;
            System.out.println();

        }

        
    }
}

package arraysOfArrays;

public class SecondAnswer {
    public static void secondAnswer()
    {
        int[][] arr = {
                {2,4,6,9,13,2},
                {1,4,76,54,32,14},
                {54,23,34,6,554,12},
                {4,5,7,8,3,21},
                {4,65,87,12,54,33},
                {43,2,5,65,12,34},
        };

        int min = 0;
        int max = arr[0].length-1;


//        for(int i = 0; i < arr.length;i++)
//        {
//            for(int j = 0; j < arr[i].length;j++)
//            {
//
//                    System.out.println(arr[i][min]);
//                    System.out.println(arr[i][max]);
//                    break;
//            }
//                min++;
//                max--;
//
//        }



        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0; j < arr[i].length;j++)
            {
                    if(min != j && max != j){

                        arr[i][j] = 0;
                    }

            }
                min++;
                max--;
        }

        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0; j < arr[i].length;j++)
            {

                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}

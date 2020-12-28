package arraysOfArrays;

public class SixthAnswer {
    public static void sixthAnswer()
    {
        int[][] arr = new int[6][6];


        for (int i = 0; i < arr.length; i++) {
            for(int j = i;j<arr[i].length-i;j++){
                arr[i][j] = 1;
                arr[arr.length-i-1][j] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

//        for(int i = 0;i< arr.length;i++)
//        {
//            for(int j = 0;j<arr[i].length;j++)
//            {
//                arr[i][j] = 1;
//            }
//
//        }
//
//        int min = 0;
//        int max = arr.length-1;
//        int halfMatrix = max/2;
//        int point = 0;
//        System.out.println(max);
//        System.out.println(halfMatrix);
//
//        for(int i = 0;i< arr.length;i++)
//        {
//            for(int j = 0;j<arr[i].length;j++)
//            {
//
//                if(j <= min)
//                {
//                    arr[i][j] = 0;
//                }
//                if(j >= max)
//                {
//                    arr[i][j] = 0;
//                }
//
//                System.out.print(arr[i][j]+"\t");
//
//            }
//            System.out.println();
//            point++;
//            if(point <= halfMatrix){
//                min++;
//                max--;
//            }else {
//                min--;
//                max++;
//            }
//
//        }
    }
}

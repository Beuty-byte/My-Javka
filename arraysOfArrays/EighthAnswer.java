package arraysOfArrays;


import java.util.Arrays;
import java.util.Scanner;

public class EighthAnswer {
    public static void eighthAnswer()
    {
        int[][] arr = {
                {2,4,6,9,13,2},
                {1,4,76,54,32,14},
                {54,23,34,6,554,12},
                {4,5,7,8,3,21},
                {4,65,87,12,54,33},
                {43,2,5,65,12,34},
        };



        int[] arrValues = userInput();
        if(checkValues(arr,arrValues)){
            resultMatrix(arr,arrValues[0],arrValues[1]);
        }else {
            System.out.println("no such column exists");
        }

    }

    private static void resultMatrix(int[][] arr,int firstColumn,int secondColumn){

        int a =0;
        int b = 0;
//        int[] firstArray = new int[arr.length];
//        int[] secondArray = new int[arr.length];

        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0; j < arr[i].length;j++)
            {
                if(j == firstColumn-1)
                {
                    a = arr[i][j];

                }
                if(j == secondColumn-1)
                {
                    b = arr[i][j];
                }

//                firstArray[i] = arr[i][firstColumn-1];
//                secondArray[i] = arr[i][secondColumn-1];
            }
            arr[i][firstColumn-1] = b;
            arr[i][secondColumn-1] = a;
        }


        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0; j< arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }


    }


    private static boolean checkValues(int[][] matrix,int[] sendValues){


            if((sendValues[0] < 1 || sendValues[0]>matrix.length)||(sendValues[1] < 1 || sendValues[1] > matrix.length)){

                return false;
            }

        return true;
    }


    private static int[] userInput(){

        int[] arr = new int[2];
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two number for swap column");
        do{
            while (!sc.hasNextInt()){
                System.out.println("Please enter only number");
                sc.nextLine();
            }
            arr[i] = sc.nextInt();
            i++;

        }while(i< arr.length);
        return arr;

    }
}

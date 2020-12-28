package decompositionUsingMethods;

import java.util.Arrays;

public class FourthAnswer {
    public static void fourthAnswer()
    {

        int[][] coordinateDote = {{-3,54},{123,54},{2,4},{6,887},{1333,12312}};
        int[] differencePointers = differenceCoordinateDote(coordinateDote);
        int maxDifferenceIndex = returnMaxDifferenceIndex(differencePointers);
        System.out.println(Arrays.toString(coordinateDote[maxDifferenceIndex]));

    }


    private static int returnMaxDifferenceIndex(int[] differencePointers){

        int maxDifferenceIndex = 0;
        for (int i = 0; i < differencePointers.length; i++) {
            if(differencePointers[i] > maxDifferenceIndex){
                maxDifferenceIndex = i;
            }
        }
        return maxDifferenceIndex;
    }


    private static int[] differenceCoordinateDote(int[][] arr){

        int differencePointer = 0;
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0] > arr[i][1]){
                differencePointer = arr[i][0] - arr[i][1];
            }else {
                differencePointer = arr[i][1] - arr[i][0];
            }
            resultArr[i] = differencePointer;
        }
        return resultArr;
    }
}













//      int[] arr = {-3,54,123,54,2,4,6,887,1333};

//    int pointer = 0;
//    int maxDifferent = 0;
//
//        for(int i = 0; i < arr.length;i++)
//        {
//        for(int j = 0;j < arr.length;j++)
//        {
//        if(arr[i]>arr[j])
//        {
//        pointer = arr[i] - arr[j];
//        }else {
//        pointer = arr[j] - arr[i];
//        }
//
//        if(pointer > maxDifferent)
//        {
//        maxDifferent = pointer;
//        }
//
//
//        }
//        }
//        System.out.println(maxDifferent);
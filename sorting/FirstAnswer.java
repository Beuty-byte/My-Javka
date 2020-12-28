package sorting;

import java.util.Arrays;

public class FirstAnswer {
    public static void firstAnswer()
    {
        int[] firstArr = {7,43,23,1,5,4,322,24};
        int[] secondArr = {3,3,23,1,6,4};
        int k = 5;
        int count = 0;

        int[] resultArray = new int[firstArr.length+secondArr.length];

        for(int i = 0;i < resultArray.length;i++)
        {
            if(i < k)
            {
                resultArray[i] = firstArr[i];
            }else if(i >= k && count < secondArr.length){
                resultArray[i] = secondArr[count];
                count++;
            }else {
                resultArray[i] = firstArr[i-secondArr.length];
            }
        }
        System.out.println(Arrays.toString(resultArray));

    }
}

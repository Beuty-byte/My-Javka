package OneDimensionalArrays;

import java.util.Arrays;

public class SecondAnswer {

    public static void secondAnswer()
    {
        int[] arr = {3,6,3,76,56,45,6,8,98};
        int z = 9;
        int count = 0;

        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] > z)
            {
                arr[i] = z;
                count++;
            }
        }

        System.out.println("Количество замен = "+count);
        System.out.println(Arrays.toString(arr));
    }
}

package decompositionUsingMethods;

public class FifthAnswer {
    public static void fifthAnswer()
    {
        int[] arr = {-3,54,77777,123,54,2,4444444,4,6,887,11421333};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println(max);

        int prevMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] > prevMax && arr[i] != max)
            {
                prevMax = arr[i];
            }
        }
        System.out.println(prevMax);

    }


}

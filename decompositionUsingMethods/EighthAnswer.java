package decompositionUsingMethods;

public class EighthAnswer {
    public static void eighthAnswer()
    {
        int[] arr = {5,8,12,32,12,4,6,1};

        int result = sumArray(arr,5);


        System.out.println(result);
    }



    public static int sumArray(int[] arr,int k)
    {
        if(k > arr.length-3)
        {
            return -1;
        }

        int sum = 0;
        for(int i = 0; i < arr.length;i++)
        {
            if(i >= k && i < k+3)
            {
                sum+=arr[i];
            }
        }
        return sum;
    }
}

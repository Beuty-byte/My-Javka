package OneDimensionalArrays;

public class SixthAnswer {
    public static void sixthAnswer()
    {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum = 0;

        for (int i = 0; i < arr.length;i++)
        {
            if(checkNumber(i)){
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }


   static boolean checkNumber(int number) {
        if(number < 2) {
            return false;
        }
        for (int i = 2; i < number;i++)
        {
            if(number%i == 0)
            {
                return false;
            }
        }
        return true;
    }

}

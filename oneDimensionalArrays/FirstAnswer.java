package OneDimensionalArrays;

public class FirstAnswer {
    public static void firstAnswer()
    {

        int[] arr = {5,7,4,8,9,12,43,14,16};
        int k = 8;
        int sum = 0;

        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i]%k == 0)
            {
                sum += arr[i];
                System.out.println(arr[i]+" кратно "+ k);
            }
        }
        System.out.println("Сумма кратных элементов = "+sum);


    }
}

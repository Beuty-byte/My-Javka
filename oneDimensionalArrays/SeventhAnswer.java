package OneDimensionalArrays;



public class SeventhAnswer {
    public static void seventhAnswer()
    {
        int[] arr = {13,2,333,44};

        int i = 0;
        int j = arr.length-1;
        int maxNumber = arr[i]+arr[j];



        while(i<=j)
        {
            if(maxNumber < arr[i]+arr[j]){
                maxNumber = arr[i]+arr[j];
            }

            i++;
            j--;
        }
        System.out.println(maxNumber);

    }


}

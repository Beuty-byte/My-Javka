package OneDimensionalArrays;

public class FifthAnswer {
    public static void fifthAnswer()
    {
        int[] arr = {1,6,3,1,6,3,2,8,9};

        for(int i = 0; i < arr.length;i++){
            if(arr[i] > i)
            {
                System.out.println("Этот элемент больше своего индекса "+arr[i]+" индекс = "+i);
            }
        }

    }
}

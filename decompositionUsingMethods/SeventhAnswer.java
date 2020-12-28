package decompositionUsingMethods;

public class SeventhAnswer {
    public static void seventhAnswer()
    {
        int n = 9;
        int sum = 0;

        for(int i = 1; i <= n; i+=2)
        {
            sum+=factorialNumber(i);
        }
        System.out.println(sum);
    }

    private static int factorialNumber(int i){
        int result = 1;
        if (i == 1 || i == 0) {
            return result;
        }
        result = i * factorialNumber(i-1);
        return result;
    }

}

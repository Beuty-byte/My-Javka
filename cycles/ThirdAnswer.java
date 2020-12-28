package cycles;

public class ThirdAnswer {
    public static void thirdAnswer()
    {
        int count = 0;
        for(int i = 1; i <= 100; i++)
        {
            count+=i*i;
        }
        System.out.println(count);
    }
}

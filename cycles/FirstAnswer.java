package cycles;

public class FirstAnswer {

    public static void firstAnswer(int x)
    {

        int i = 1;
        int count = 0;
        while(i <= x)
        {
            System.out.println(count);
            count += i;
            i++;
        }

        System.out.println(count);

    }

}

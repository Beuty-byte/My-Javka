package decompositionUsingMethods;

public class EleventhAnswer {
    public static void eleventhAnswer()
    {
        int a = 12312;
        int b = 1234;

        int resultNumber = compareNumbers(a,b);
        System.out.println(resultNumber);
    }

    private static int compareNumbers(int a, int b)
    {
        if(String.valueOf(a).length() > String.valueOf(b).length())
        {
            return a;
        }else if (String.valueOf(a).length() < String.valueOf(b).length())
        {
            return b;
        }else {
            return -1;
        }
    }
}

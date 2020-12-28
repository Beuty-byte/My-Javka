package decompositionUsingMethods;

public class SixthAnswer {
    public static void sixthAnswer(int a, int b, int c)
    {

        if(NOD(a,b) != 1 && NOD(a,c) != 1 && NOD(b,c) != 1 )
        {
            System.out.println("Числа не взаимно простые");
        }else {
            System.out.println("Числа взаимно простые");
        }

    }

    private static int NOD(int a, int b)
    {
        while (a != b) {
            if (a > b) {
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
}

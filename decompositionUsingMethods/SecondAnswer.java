package decompositionUsingMethods;

public class SecondAnswer {
    public static void secondAnswer(int a,int b, int c, int d)
    {
        System.out.println(NOD(NOD(a,b),NOD(c,d)));
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

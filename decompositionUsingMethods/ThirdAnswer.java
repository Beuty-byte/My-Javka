package decompositionUsingMethods;

public class ThirdAnswer {
    public static void thirdAnswer(int a)
    {
        System.out.println(areaOfTriangle(a));
    }

    public static double areaOfTriangle(int a)
    {
        double S = Math.sqrt(3) / 4 * Math.pow(a,2);
        return S*6;
    }
}

package answer;

public class FourthAnswer {
    public static void reversDouble(double x)
    {
        //double x = 432.123;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}

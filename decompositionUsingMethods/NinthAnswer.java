package decompositionUsingMethods;

public class NinthAnswer {
    public static void ninthAnswer()
    {
        int x = 10;
        int y = 12;
        int z = 15;
        int t = 10;

        double c = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double s1 = squareOfTriangle(x,y,c);
        double s2 = squareOfTriangle(z,t,c);
        double square = s1+s2;
        System.out.println(square);
    }



    private static double squareOfTriangle(double a,double b,double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    
}

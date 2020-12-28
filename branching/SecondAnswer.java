package branching;

public class SecondAnswer {

    public static void maxMinNumber(int a, int b, int c,int d)
    {


        int min1;
        int min2;

        if(a > b)
        {
            min1 = b;
        }else{
            min1 = a;
        }

        if(c > d)
        {
            min2 = d;
        }else {
            min2 = c;
        }

        if(min1 > min2)
        {
            System.out.println(min1);
        }else{
            System.out.println(min2);
        }


        //System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }

}

package decompositionUsingMethods;

public class FirstAnswer {
    public static void firstAnswer(int a, int b)
    {
        int nod = searchNOD(a,b);
        int nok = searchNOK(nod,a,b);

        System.out.println("NOD = " + nod);
        System.out.println("NOK = " + nok);
    }

    private static int searchNOK(int nod , int a,int b){
        return (a*b)/nod;
    }

    private static int searchNOD(int a, int b){
        int d = 0;

        while (isNumberNotNull(a,b)) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            d = a + b;
        }
        return d;
    }

    private static boolean isNumberNotNull(int a, int b){

        if(b != 0 && a != 0){
            return true;
        }
        return false;
    }

}

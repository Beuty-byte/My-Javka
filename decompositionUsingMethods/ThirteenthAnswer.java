package decompositionUsingMethods;

public class ThirteenthAnswer {

    public static void thirteenAnswer() {
        int a=1,aa=a,b=600,kvo=0;

        System.out.print("Числа: ");
        while (aa%6!=0) {
            aa++;
        }
        for (int i=aa; i<=b; i+=6) {
            if (prost(i-1) && prost(i+1)) {
                if (!((i-1)<aa || (i+1)>b))
                {
                    kvo++; System.out.print((i-1)+" "+(i+1)+" ");
                }
            }
        }
        System.out.print("\nКол-во пар чисел-близнецов на отрезке ["+a+"; "+b+"] :"+kvo);
    }

    private static boolean prost(int n) {
        int sum=0;
        for (int i=1; i<=(int) Math.sqrt(n); i++) {
            if (n%i==0) {
                if (i==Math.sqrt(n))
                {
                    sum++;
                }
                else {
                    sum+=2;
                }

            }
        }
        if (sum==2){
            return true;
        }
        else {
            return false;
        }
    }






}

package decompositionUsingMethods;

public class Testing {
    public static void testing(int n){
        int count = countAllert(0,n);
        System.out.println(count);
    }

    private static int countAllert(int count,int n){
        int[] intArr = transform(n);
        int sum = sum(intArr);

        int j = n - sum;
        count++;
        if(j > 0){
            count = countAllert(count,j);
        }

        return count;

    }

    private static int sum (int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    private static int[] transform ( int a){
        String temp = Integer.toString(a);
        int[] arr = new int [temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            arr[i] = temp.charAt(i) - '0';
        }
        return arr;
    }
}

package decompositionUsingMethods;

import java.util.ArrayList;
import java.util.List;

public class FifteenthAnswer {
    public static void fifteenthAnswer(int n) {
        List<Integer> ascOrder = new ArrayList<>();
        for (int i = (int)Math.pow(10,n); i < (int)Math.pow(10,n+1)-1; i++) {
            int[] c = transformInArray(i);
            if (checkAscension(c)) {
                ascOrder.add(i);
            }
        }

        for (int i = 0; i < ascOrder.size(); i++) {
            System.out.println(ascOrder.get(i));
        }

    }

    public static boolean checkAscension(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static int[] transformInArray(int n) {
        String temp = Integer.toString(n);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }
        return arr;
    }
    
}

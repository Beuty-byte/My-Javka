package decompositionUsingMethods;

public class SixteenthAnswer {
    private int sum = 0;
    private int counter = 0;

    @Override
    public String toString() {
        return "UnevenNumbers " + "sum = " + sum + ", amount of even numbers = " + counter;
    }

    public SixteenthAnswer(int sum, int counter) {
        this.sum = sum;
        this.counter = counter;
    }

    public static SixteenthAnswer unevenNumbers(int n) {
        int sum = 0;
        for (int i = (int)Math.pow(10,n); i < (int)Math.pow(10,n+1)-1; i++) {
            int[] j = transformInArray(i);
            if (unevenCheck(j)) {
                sum += i;
            }
        }
        return new SixteenthAnswer(sum, evenCheck(transformInArray(sum)));
    }

    public static int evenCheck(int[] a) {
        int count = 0;
        for (int j : a) {
            if (j % 2 == 0 && j != 0) count++;
        }
        return count;
    }

    public static boolean unevenCheck(int[] a) {
        for (int j : a) {
            if (j % 2 == 0) return false;
        }
        return true;
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
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




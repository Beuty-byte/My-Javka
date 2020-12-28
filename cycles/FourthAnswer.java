package cycles;

import java.math.BigDecimal;


public class FourthAnswer {
    public static void fourthAnswer()
    {

        int N = 200;

        int[] array = new int[N];

        for (int i = 1, k = 0; i <= N; i++, k++) {
            array[k] = i * i;
        }
        BigDecimal sum = BigDecimal.ONE;
        for (int i = 0; i < N; i++) {
            sum = sum.multiply(BigDecimal.valueOf(array[i]));
        }
        System.out.println(sum);
        }

    }


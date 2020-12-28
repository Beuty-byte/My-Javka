package OneDimensionalArrays;

import java.util.Arrays;

public class NinthAnswer {
    public static void ninthAnswer()
    {
        int[] arr = {2,3,4,4,5,5,6,7,8,9,9,9};



        int[] popular = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    popular[i]++;
                }
            }
        }

        System.out.println(Arrays.toString(popular));

        int valResult = arr[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = arr[i];
            }
            if ((popResult == popular[i]) && (arr[i] < valResult)) {
                valResult = arr[i];
            }
        }

    }
}

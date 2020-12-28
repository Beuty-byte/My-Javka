package sorting;

import java.util.Arrays;

public class SecondAnswer {
    public static void secondAnswer()
    {
        int[] arr = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};


        for (int i = 0; i < arr.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = arr[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = arr[j];
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;    // меняем местами наименьший с array[i]
        }

        System.out.println(Arrays.toString(arr));
    }
}

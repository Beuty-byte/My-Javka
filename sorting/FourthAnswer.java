package sorting;

import java.util.Arrays;

public class FourthAnswer {
    public static void fourthAnswer()
    {
        int[] arr = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(arr));
        for (int left = 0; left < arr.length; left++) {

// Вытаскиваем значение элемента

            int value = arr[left];

// Перемещаемся по элементам, которые перед вытащенным элементом

            int i = left - 1;
            for (; i >= 0; i--) {

// Если вытащили значение меньшее — передвигаем больший элемент дальше

                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {

// Если вытащенный элемент больше — останавливаемся

                    break;
                }
            }

// В освободившееся место вставляем вытащенное значение

            arr[i + 1] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
}

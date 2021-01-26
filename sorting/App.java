package sorting;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = {4,12,43,125,65,78,90};
        showMinAndMaxValueInArray(arr);


        int[] sortArray = {4,7,8,12,15,23,54,76,889,975,1212};
        int result = binarySearch(sortArray,12);
        System.out.println("Result: "+result);
        System.out.println();

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println();

        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j]> key) {
                arr[j + 1]= arr[j];
                j = j - 1;
            }
            arr[j + 1]= key;
        }
    }

    private static void selectionSort(int[] array) {
            for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
                int pos = i;
                int min = array[i];
                // цикл выбора наименьшего элемента
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        pos = j;    // pos - индекс наименьшего элемента
                        min = array[j];
                    }
                }
                array[pos] = array[i];
                array[i] = min;    // меняем местами наименьший с array[i]
            }
        }

    private static void bubbleSort(int[] array){
        int comparisonsDone = 0;
        int swapDone = 0;
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    System.out.println("Swap "+array[i]+" and "+ array[i+1]);
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapDone++;
                    sorted = false;
                }else {
                    System.out.println("Not need swap lement "+i+" and " +(i+1));
                }
                comparisonsDone++;
            }
        }
        System.out.println("Array size = "+ array.length);
        System.out.println("Comparisons done "+ comparisonsDone);
        System.out.println("Swap done = "+ swapDone);
    }

    private static int binarySearch(int[] arr, int searchNumber){
        int position = 0;
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int middle = (left + right)/2;
            if(arr[middle] == searchNumber){
                System.out.println("Key found");
                return middle;
            }
            if(arr[middle] < searchNumber){
                left = middle + 1;
            }
            if(arr[middle] > searchNumber){
                right = middle - 1;
            }
        }
            return -1;
    }


    private static void showMinAndMaxValueInArray(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max element = " + max + " min element = " + min);
    }
}

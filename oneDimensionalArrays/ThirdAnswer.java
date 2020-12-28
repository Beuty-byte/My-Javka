package OneDimensionalArrays;

public class ThirdAnswer {
    public static void thirdAnswer()
    {
        int[] arr = {1,5,7,4,0,3,-1,-7,0, 15};
        int countPositiveNumber = 0;
        int countNegativeNumber = 0;
        int countZero = 0;

        for (int elem: arr)
        {
            if(elem > 0){
                countPositiveNumber++;
            }else if(elem < 0)
            {
                countNegativeNumber++;
            }else{
                countZero++;
            }
        }
        System.out.println("Количество положительных эллементов = " + countPositiveNumber);
        System.out.println("Количество отрицательных эллементов = " + countNegativeNumber);
        System.out.println("Количество нулевых эллементов = " + countZero);

    }
}

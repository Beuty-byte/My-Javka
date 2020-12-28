package answer;


import java.util.Scanner;


public class FifthAnswer {

    public static void countingTheTime()
    {

        Scanner sc = new Scanner(System.in);
        int x;
        do{

            while(!sc.hasNextInt())
            {
                System.out.println("Вводите только число для определения времени");
                sc.next();
            }
            System.out.println("Пожалуйста вводите только положительные числа");
            x = sc.nextInt();

        }while(x <= 0);

        int sec = 0;
        int min = 0;
        int hour = 0;

        hour = x / 3600;
        min = x%3600/60;
        sec = x%3600%60;


        System.out.println("Hour = "+hour+" min = "+min+" sec = "+sec);
    }

}

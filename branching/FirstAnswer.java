package branching;

public class FirstAnswer {

    public static void checkTriangle(int a, int b)
    {
        if(a+b < 180)
        {
            System.out.println("Треугольник существует");
            if(a == 90 || b == 90 || a+b == 90)
            {
                System.out.println("Треугольник прямоугольный");
            }
        }else{
            System.out.println("Треугольник не существует");
        }
    }

}

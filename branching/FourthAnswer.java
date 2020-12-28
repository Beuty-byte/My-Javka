package branching;

public class FourthAnswer {

    public static void brickQuestion(int A,int B, int x,int y, int z)
    {

        if(x <= A && y <= B || y <= A && x <= B)
        {
            System.out.println("Первая сторона пройдет");
        }else {
            System.out.println("Первая сторона не пройдет");
        }

        if(y <= A && z <= B || z <= A && y <= B)
        {
            System.out.println("Вторая сторона пройдет");
        }else {
            System.out.println("Вторая сторона не пройдет");
        }

        if(z <= A && x <= B || x <= A && z <= B)
        {
            System.out.println("Третья сторона пройдет");
        }else {
            System.out.println("Третья сторона не пройдет");
        }


    }
}

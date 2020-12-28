package branching;

public class ThirdAnswer {

    public static void coordinateDot(int x1,int y1,int x2, int y2, int x3,int y3)
    {
        if(x1 == x2 && x2 == x3)
        {
            System.out.println("Точки пересекаются по оси X");
        }else if(y1 == y2 && y2 == y3){
            System.out.println("Точки пересекаются по оси Y");
        }else {
            System.out.println("Точки не пересекаются");
        }
    }
}

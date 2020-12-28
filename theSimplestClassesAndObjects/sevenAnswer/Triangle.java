package theSimplestClassesAndObjects.sevenAnswer;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public void squareTriangle(){
        double p = (a+b+c)/2;
        double squareTriangle = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(squareTriangle + " square Triangle");
    }

    public void perimeterTriangle(){
        int perimeter = a+b+c;
        System.out.println(perimeter + " perimeter triangle");
    }

    public void medianTriangle(){
        double medianA =  Math.sqrt(2 * Math.pow(b,2) + 2 * Math.pow(c,2) - Math.pow(a,2)) / 2;
        double medianB =  Math.sqrt(2 * Math.pow(a,2) + 2 * Math.pow(c,2) - Math.pow(b,2)) / 2;
        double medianC =  Math.sqrt(2 * Math.pow(a,2) + 2 * Math.pow(b,2) - Math.pow(c,2)) / 2;
        System.out.println((medianA+medianB+medianC)/3 + " median intersection point");
    }
}

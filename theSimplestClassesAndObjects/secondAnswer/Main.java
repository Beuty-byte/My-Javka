package theSimplestClassesAndObjects.secondAnswer;

public class Main {
    public static void main(String[] args) {

        Test2 test2 = new Test2();
        System.out.println(test2.getStr1()+" "+test2.getStr2());
        Test2 test = new Test2("Hell","World");
        System.out.println(test.getStr1()+" "+test.getStr2());
    }
}

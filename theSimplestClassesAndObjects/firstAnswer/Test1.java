package theSimplestClassesAndObjects.firstAnswer;

public class Test1 {
    private int firstNumber;
    private int secondNumber;


    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void outPuts(){
        System.out.println(this.firstNumber+" "+this.secondNumber);
    }


    public int sumNumbers(){
        return firstNumber+secondNumber;
    }

    public int compareNumbers(){
        if(firstNumber>secondNumber){
            return firstNumber;
        }else {
            return secondNumber;
        }
    }
}

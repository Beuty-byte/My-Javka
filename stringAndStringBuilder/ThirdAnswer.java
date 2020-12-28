package stringAndStringBuilder;

public class ThirdAnswer {
    public static void thirdAnswer()
    {
        String str = "Лёша на полке клопа нашёл";
        String cleanStr = str.replaceAll("\\s+","").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(cleanStr);
        stringBuilder.reverse();

        if(stringBuilder.toString().equals(cleanStr)){
            System.out.println("This string palindrom");
        }else {
            System.out.println("This string not palindrom");
        }
    }
}

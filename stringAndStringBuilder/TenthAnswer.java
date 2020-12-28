package stringAndStringBuilder;

public class TenthAnswer {
    public static void tenthAnswer()
    {
        String str = "sdas!dqwe! sadas. sadsadqq . sada?sdasd? sadas.dwq !";

        String[] strings = str.split("\\.|\\?|\\!");

        System.out.println(strings.length);
    }
}

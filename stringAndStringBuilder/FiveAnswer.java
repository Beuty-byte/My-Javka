package stringAndStringBuilder;

public class FiveAnswer {
    public static void fiveAnswer()
    {
        String str = "asdawdasdsdgfa asdasdadadaaa";
        System.out.println(countLetter(str,'a'));
    }

    private static int countLetter(String str,char ch)
    {
        char[] chars = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ch){
                counter++;
            }
        }
        return counter;
    }
}

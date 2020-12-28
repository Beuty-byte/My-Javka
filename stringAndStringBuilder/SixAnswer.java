package stringAndStringBuilder;

public class SixAnswer {
    public static void sixAnswer()
    {
        String str = "new string";
        str = returnNewString(str);
        System.out.println(str);
    }

    private static String returnNewString(String str)
    {
        //String resultString = "";
        StringBuilder resultString = new StringBuilder();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            resultString.append(chars[i]);
            resultString.append(chars[i]);
            //resultString+=chars[i];
            //resultString+=chars[i];
        }
        return resultString.toString();
    }
}

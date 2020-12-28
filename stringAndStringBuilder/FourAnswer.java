package stringAndStringBuilder;

public class FourAnswer {
    public static void fourAnswer()
    {
        String str = "информатика";
        char[] ch = new char[str.length()];

        str.getChars(0,str.length(),ch,0);


        String resultString = "";
        resultString+= returnChar(findIndex(ch,'т',str),str);
        resultString+= returnChar(findIndex(ch,'о',str),str);
        resultString+= returnChar(findIndex(ch,'р',str),str);
        resultString+= returnChar(findIndex(ch,'т',str),str);
        System.out.println(resultString);

    }

    private static int findIndex(char[] charArr, char ch,String str)
    {
        for (int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ch){
                return str.indexOf(charArr[i]);
            }
        }
        return -1;
    }

    private static char returnChar(int index, String str)
    {
        return str.charAt(index);
    }

}

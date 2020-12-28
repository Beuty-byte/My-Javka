package cycles;

public class FiveAnswer {
    public static void fiveAnswer(){

        //String str = "вывцйумуукае";
        String str = "dsadwqdasdasda";
        char[] ch = str.toCharArray();



        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]+" = "+(byte)ch[i]);
        }

    }
}

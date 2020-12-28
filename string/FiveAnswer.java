package string;

public class FiveAnswer {
    public static void fiveAnswer()
    {
        String str = " Delete    All  superfluous    space  ";
        str = str.replaceAll("\\s+"," ").strip();
        System.out.println(str);
    }
}

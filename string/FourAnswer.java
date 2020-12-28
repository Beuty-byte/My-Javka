package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FourAnswer {
    public static void fourAnswer()
    {
        String str = " sad 123 dasd 21 s 4 32";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }


}

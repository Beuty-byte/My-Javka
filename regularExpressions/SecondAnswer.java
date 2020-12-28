package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondAnswer {
    public static void secondAnswer() {

        String str = getString();

        String closedTagRegExp = "(<[/].+[^/]>)";
        String notBodyTagRegExp = "(<[^/].+[/])>";
        String openTagRegExp = "(<[^/].*?[^/]>)";
        String bodyRegExp = "[^<[/].+[^/]>][^<[^/].+[/])>][^<[^/].*?[^/]>].+";

        Pattern patternKnots = Pattern.compile(closedTagRegExp+"|"+notBodyTagRegExp+"|"+openTagRegExp+"|"+bodyRegExp);

        Matcher matcherFull = patternKnots.matcher(str);
        while (matcherFull.find()){

            if(matcherFull.group().matches(closedTagRegExp)){
                System.out.println(matcherFull.group()+" - it's closed tag");
            }

            if(matcherFull.group().matches(notBodyTagRegExp)){
                System.out.println(matcherFull.group()+" - it's not body tag");
            }

            if(matcherFull.group().matches(openTagRegExp)){
                System.out.println(matcherFull.group()+" - it's open tag");
            }

            if(matcherFull.group().matches(bodyRegExp)){
                System.out.println(matcherFull.group()+"  - it's content");
            }
        }
        }






    private static String getString(){

        String str = "<notes><note id = \"1\"><to>Вася</to><from>Света</from><heading>Напоминание</heading><body>Позвони мне завтра!</body></note>\n" +
                "\n" +
                "   <note id = \"2\">\n" +
                "\n" +
                "       <to>Петя</to>\n" +
                "\n" +
                "       <from>Маша</from>\n" +
                "\n" +
                "       <heading>Важное напоминание</heading>\n" +
                "\n" +
                "       <body/>\n" +
                "\n" +
                "   </note>\n" +
                "\n" +
                "</notes>";
        return str;
    }
}

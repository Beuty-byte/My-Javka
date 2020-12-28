package string;

public class ThirdAnswer {
    public static void thirdAnswer()
    {
        String str = "asdjlk 123123";

        char[] ch = str.toCharArray();

        int count = 0;

        for(int i = 0; i < ch.length;i++)
        {
            if(ch[i] >= '0' && ch[i] <= '9')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

package regularExpressions.firstAnswer;

import java.util.ArrayList;

public class SortParagraph {
    public static String sortParagraph(String text){
        String[] strings = text.split("\\n{2,}");
        ArrayList<Integer> listCount = new ArrayList<Integer>();
        for (int i = 0; i < strings.length; i++) {

            listCount.add(sentenceCount(strings[i]));

        }

        int[] arr = new int[listCount.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = listCount.get(i);
        }

            boolean isSorted = false;
            int buf;
            String temp = "";
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] > arr[i+1]){
                        isSorted = false;

                        buf = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = buf;

                        temp = strings[i];
                        strings[i] = strings[i+1];
                        strings[i+1] = temp;
                    }
                }
            }

        String resultString = constructString(strings);

        return resultString;
    }



    private static String constructString(String[] strings){

        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str+="\t"+strings[i]+"\n\n";
        }
        return str;
    }



    private static int sentenceCount(String str){
        String[] strings = str.split("\\.");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            count++;
        }
        return count;
    }
}

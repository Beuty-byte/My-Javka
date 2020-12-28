package regularExpressions.firstAnswer;

import java.util.ArrayList;

public class SortSentence {
    public static String sortSentence(String text){
        String[] strings = text.split("\\.");

        for (int i = 0; i < strings.length; i++) {
            strings[i] = wordLengthCount(strings[i]);
        }
        return constructLetter(strings);
    }

    private static String wordLengthCount(String str){
        String[] strings = str.split("\\s+");
        ArrayList<Integer> listCount = new ArrayList<Integer>();
        for (int i = 0; i < strings.length; i++) {
            listCount.add(strings[i].length());
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

        return constructSentence(strings);
    }

    private static String constructLetter(String[] strings){
        //String str = "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            //str+=strings[i]+".";
            str.append(strings[i]).append(".");
        }
        return str.toString();
    }

    private static String constructSentence(String[] strings){
        //String str = "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            //str+=strings[i]+" ";

            if(i == strings.length-1){
                str.append(strings[i]);
                //str+=strings[i];
            }else{
                str.append(strings[i]).append(" ");
            }
        }
        return str.toString();
    }

}

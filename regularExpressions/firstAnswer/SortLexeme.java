package regularExpressions.firstAnswer;

import java.util.ArrayList;

public class SortLexeme {
    public static String sortLexeme(String text,char ch){

        String[] strings = text.split("\\.");
        String[] sortStrings = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            sortStrings[i] =   checkLexeme(strings[i],ch);
        }

        return finalBuildString(sortStrings);

    }

    private static String checkLexeme(String str, char ch){

        String[] strings = str.split("\\s+");
        ArrayList<Integer> listCount = new ArrayList();

        for (int i = 0; i < strings.length; i++) {
            listCount.add(checkChar(strings[i],ch));
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
                if(arr[i] < arr[i+1]){
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

        String temps;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){


                    if(0 < strings[i].compareTo(strings[j])){
                        temps =  strings[i];
                        strings[i] =  strings[j];
                        strings[j] = temps;
                    }

                }
            }
        }

        return stringBuild(strings);
    }

    private static int checkChar(String str,char ch){

        char[] arrChar = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if(arrChar[i] == ch){
                count++;
            }
        }
        return count;

    }

    private static String finalBuildString(String[] str){
        //String returnString = "";
        StringBuilder returnString = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            returnString.append(str[i]).append(".");
            //returnString+= str[i]+".";
        }

        return returnString.toString();
    }

    private static String stringBuild(String[] strings){
        //String str = "";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
//            if(strings[i].length()<3){
//                continue;
//            }
            str.append(strings[i]).append(" ");
            //str+= strings[i]+" ";
        }
        return str.toString();
    }
}

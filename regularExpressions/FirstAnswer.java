package regularExpressions;

import java.util.ArrayList;


public class FirstAnswer {
    public static void firstAnswer()
    {
        String str = getString();

        int positiveDirection = 1;
        int negativeDirection = 0;

        str = sortParagraph(str, positiveDirection);
        System.out.println(str);

        str = sortSentence(str,negativeDirection);
        System.out.println(str);

        str = sortLexeme(str,'е');
        System.out.println();
        System.out.println(str);

    }

    // Methods for sort lexeme
    private static String sortLexeme(String str, char ch){

        String[] strings = str.split("\\.");
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


//                   temps =  strings[i];
//                  strings[i] =  compareChars(strings[i],strings[j]);
//                  strings[j] = temps;
                }
            }
        }

        return stringBuild(strings);
    }

    private static String stringBuild(String[] strings){
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length()<3){
                continue;
            }
            str+= strings[i]+" ";
        }
        return str;
    }

/*
    private static String compareChars(String str1, String str2){
        // Это у меня тут гавно код))) можно все заменить compareTo()
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if(ch1.length > ch2.length){

            for (int i = 0; i < ch2.length; i++) {
                if(ch2[i]>ch1[i]){
                    return str2;
                }
            }return str1;
        }else {
            for (int i = 0; i < ch1.length; i++) {
                if(ch1[i]>ch2[i]){
                    return str1;
                }
            }return str2;
        }
    }
*/
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
        String returnString = "";

        for (int i = 0; i < str.length; i++) {

            returnString+= str[i]+".";
        }

        return returnString;
    }
    // end methods for sort lexeme


    //Methods for sort sentence

    private static String sortSentence(String str, int direction){

        String[] strings = str.split("\\.");



        for (int i = 0; i < strings.length; i++) {

           strings[i] = wordLengthCount(strings[i],direction);

        }

        return constructLetter(strings);


    }

    private static String wordLengthCount(String str,int direction){
        String[] strings = str.split("\\s+");
        ArrayList<Integer> listCount = new ArrayList<Integer>();
        for (int i = 0; i < strings.length; i++) {
                listCount.add(strings[i].length());
        }

        int[] arr = new int[listCount.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = listCount.get(i);
        }


        if(direction == 1){
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
        }

        if(direction == 0){
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
        }

         return constructSentence(strings);

    }

    private static String constructLetter(String[] strings){
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str+=strings[i]+".";

        }
        return str;
    }

    private static String constructSentence(String[] strings){
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str+=strings[i]+" ";
            if(i == strings.length-1){
                str+=strings[i];
            }
        }
        return str;
    }

    //Method for sort sentence end

//Methods for sort paragraph

    private static String sortParagraph(String str, int direction){
        String[] strings = str.split("\\n{2,}");
        ArrayList<Integer> listCount = new ArrayList<Integer>();
        for (int i = 0; i < strings.length; i++) {

               listCount.add(sentenceCount(strings[i]));

        }

        int[] arr = new int[listCount.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = listCount.get(i);
        }


        if(direction == 1){
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
        }

        if(direction == 0){
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
//end methods for sort paragraph















    private static String getString(){
        String text = "В доме Прозоровых. Гостиная с колоннами, за которыми виден большой зал. Полдень; на дворе солнечно, весело. В зале накрывают стол для завтрака.\n" +
                "\n" +
                "Ольга в синем форменном платье учительницы женской гимназии, все время поправляет ученические тетрадки, стоя и на ходу; Маша в черном платье, со шляпкой на коленях сидит и читает книжку, Ирина в белом платье стоит задумавшись.\n" +
                "\n" +
                "Ольга. Отец умер ровно год назад, как раз в этот день, пятого мая, в твои именины, Ирина. Было очень холодно, тогда шел снег. Мне казалось, я не переживу, ты лежала в обмороке, как мертвая. Но вот прошел год, и мы вспоминаем об этом легко, ты уже в белом платье, лицо твое сияет. (Часы бьют двенадцать.) И тогда также били часы. Пауза. Помню, когда отца несли, то играла музыка, на кладбище стреляли. Он был генерал, командовал бригадой, между тем народу шло мало. Впрочем, был дождь тогда. Сильный дождь и снег.";
        return text;
    }
}

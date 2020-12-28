package regularExpressions.firstAnswer;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String text = getText.getText(); захардкоженный текст


        System.out.println("Please enter text");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine().trim();

        if(!inputText.isBlank()) {
            while (true) {
                System.out.println("You can doing next operation with text sort paragraph, sort sentence, sort lexeme");
                System.out.println("Command: SORT PARAGRAPH, SORT SENTENCE, SORT LEXEME \'and need input char\'");
                String inputCommand = sc.nextLine();

                if (inputCommand.trim().matches("SORT PARAGRAPH")) {
                    System.out.println(SortParagraph.sortParagraph(inputText));
                }

                if (inputCommand.trim().matches("SORT SENTENCE")) {
                    System.out.println(SortSentence.sortSentence(inputText));
                }

                if (inputCommand.trim().matches("SORT LEXEME [a-zA-Zа-яА-Яё]")) {
                    inputCommand = inputCommand.substring(12, 13).trim();
                    char ch = inputCommand.charAt(0);
//                    System.out.println(inputCommand);
//                    System.out.println(inputText);
                    System.out.println(SortLexeme.sortLexeme(inputText,ch));
                }

            }
        }
    }
}

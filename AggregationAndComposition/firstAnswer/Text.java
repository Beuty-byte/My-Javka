package AggregationAndComposition.firstAnswer;

public class Text {

    private String header;
    private String body = "";

    public Text(Word word) {
        header = word.getWord();
    }

    public Text(Sentence sentence) {
        header = sentence.getValue();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getWord();
    }

    public void addBody(Sentence sentence) {
        body += " " + sentence.getValue();
    }

    public String getBody() {
        return body;
    }
}

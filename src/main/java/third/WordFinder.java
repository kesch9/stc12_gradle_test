package third;

import java.net.URL;
import java.util.HashSet;

public interface WordFinder {

    HashSet<String> getSenteces(URL source);
    boolean checkInWordSentence(String sentence, String word);
    public void writeSentenceToResult(String sentence);

}

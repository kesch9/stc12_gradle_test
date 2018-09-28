package third;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;

public class WordFinderUser {

    WordFinder wordFinder;

    public WordFinderUser(WordFinder wordFinder) {
        this.wordFinder = wordFinder;
    }

    public void doWork(String resource, String word) throws MalformedURLException {
        HashSet<String> sentences = wordFinder.getSenteces(new URL(resource));
        for (String sentence:sentences){
            if (wordFinder.checkInWordSentence(sentence,word)){
                wordFinder.writeSentenceToResult(sentence);
            }
        }
    }
}

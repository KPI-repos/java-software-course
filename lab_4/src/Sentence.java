import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sentence consisting of words and punctuation marks.
 */
public class Sentence {
    private List<Word> words;
    private String originalSentence;

    /**
     * Constructor to create a Sentence object from a string.
     *
     * @param sentence the string representing the sentence
     */
    public Sentence(String sentence) {
        this.words = new ArrayList<>();
        this.originalSentence = sentence.trim();

        // Normalize whitespace and split into parts
        sentence = sentence.replaceAll("\\s+", " ").trim();

        // Extract valid words (only alphabetic words) and store them
        String[] parts = sentence.split("[\\s,]+");
        for (String part : parts) {
            if (part.matches("[а-яА-ЯїЇєЄґҐіІ]+")) { // Only alphabetic words
                words.add(new Word(part));
            }
        }
    }

    /**
     * Returns the list of words in the sentence.
     *
     * @return a list of Word objects
     */
    public List<Word> getWords() {
        return words;
    }

    /**
     * Checks if the sentence contains a specific word.
     *
     * @param targetWord the word to search for
     * @return true if the word is found, false otherwise
     */
    public boolean containsWord(String targetWord) {
        for (Word word : words) {
            if (word.getWordAsString().equalsIgnoreCase(targetWord)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the original string representation of the sentence.
     *
     * @return the sentence as a string
     */
    @Override
    public String toString() {
        return originalSentence;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a word consisting of letters.
 */
public class Word {
    private List<Letter> letters;

    /**
     * Constructor to create a Word object from a string.
     *
     * @param word the string representing the word
     */
    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    /**
     * Returns the string representation of the word.
     *
     * @return a string containing all the letters in the word
     */
    public String getWordAsString() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.getCharacter());
        }
        return sb.toString();
    }

    /**
     * Returns the number of letters in the word.
     *
     * @return the number of letters in this word
     */
    public int getLetterCount() {
        return letters.size();
    }

    /**
     * Returns the string representation of the word.
     *
     * @return the word as a string
     */
    @Override
    public String toString() {
        return getWordAsString();
    }
}

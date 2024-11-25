/**
 * Represents a punctuation mark in a sentence.
 */
public class Punctuation {
    private char mark;

    /**
     * Constructor to create a Punctuation object.
     *
     * @param mark the character representing the punctuation mark
     */
    public Punctuation(char mark) {
        this.mark = mark;
    }

    /**
     * Returns the punctuation mark.
     *
     * @return the character representing this punctuation
     */
    public char getMark() {
        return mark;
    }

    /**
     * Returns the string representation of the punctuation mark.
     *
     * @return a string containing the punctuation mark
     */
    @Override
    public String toString() {
        return String.valueOf(mark);
    }
}

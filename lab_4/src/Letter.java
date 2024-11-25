/**
 * Represents a single letter in a word.
 */
public class Letter {
    private char character;

    /**
     * Constructor to create a Letter object.
     *
     * @param character the character representing the letter
     */
    public Letter(char character) {
        this.character = character;
    }

    /**
     * Returns the character of this letter.
     *
     * @return the character representing this letter
     */
    public char getCharacter() {
        return character;
    }

    /**
     * Returns the string representation of the letter.
     *
     * @return a string containing the letter character
     */
    @Override
    public String toString() {
        return String.valueOf(character);
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a text consisting of sentences.
 */
public class Text {
    private List<Sentence> sentences;

    /**
     * Constructor to create a Text object from a string.
     *
     * @param rawText the string representing the text
     */
    public Text(String rawText) {
        this.sentences = new ArrayList<>();

        // Split the text into sentences
        String[] sentenceParts = rawText.split("\\.\\s*");
        for (String part : sentenceParts) {
            if (!part.isBlank()) {
                sentences.add(new Sentence(part.trim() + "."));
            }
        }
    }

    /**
     * Finds the most common word in the text and prints sentences containing it.
     */
    public void findMostCommonWordAndSentences() {
        List<String> allWords = new ArrayList<>();
        for (Sentence sentence : sentences) {
            for (Word word : sentence.getWords()) {
                allWords.add(word.getWordAsString().toLowerCase());
            }
        }

        // Count the frequency of each word
        String[] uniqueWords = new String[allWords.size()];
        int[] wordCounts = new int[allWords.size()];
        int uniqueWordCount = 0;

        for (String word : allWords) {
            boolean found = false;
            for (int i = 0; i < uniqueWordCount; i++) {
                if (uniqueWords[i].equals(word)) {
                    wordCounts[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[uniqueWordCount] = word;
                wordCounts[uniqueWordCount] = 1;
                uniqueWordCount++;
            }
        }

        // Find the most frequent word
        String mostCommonWord = "";
        int maxFrequency = 0;
        for (int i = 0; i < uniqueWordCount; i++) {
            if (wordCounts[i] > maxFrequency) {
                maxFrequency = wordCounts[i];
                mostCommonWord = uniqueWords[i];
            }
        }

        // Print results
        System.out.println("Найчастіше слово: " + mostCommonWord);
        System.out.println("Кількість речень: " + maxFrequency);
        System.out.println("Речення:");
        for (Sentence sentence : sentences) {
            if (sentence.containsWord(mostCommonWord)) {
                System.out.println("- " + sentence);
            }
        }
    }
}

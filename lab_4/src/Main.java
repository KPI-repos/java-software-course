// --- [Варіант 15] ---

/**
 * Main class to demonstrate the refactored Lab 2 using custom classes.
 */

public class Main {
    /**
     * The main method acts as the entry point for the program.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try {
            String text = "Перша музична символіка нашого народу сягає часів Київської Русі. "
                    + "Тоді роль державного гімну – в сьогоднішньому розумінні – виконували бойові заклики та пісні, "
                    + "які створювали патріотичний настрій перед битвами. "
                    + "Як свідчить \"Слово о полку Ігоревім\", пісні закликали воїнів до хоробрості, "
                    + "аби здобути \"князю славу\", відплатити ворогам \"за землю Руську\", за рани.";

            Text processedText = new Text(text);

            processedText.findMostCommonWordAndSentences();
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}

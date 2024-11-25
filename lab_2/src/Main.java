// --- [Варіант 15] ---  

// -- C3 = 3
//C = String, 

// C17 = 0
// Знайти найбільшу кількість речень заданого тексту, в яких є однакові слова. 

public class Main {
    public static void main(String[] args) {
        try {
            String text = "Перша музична символіка нашого народу сягає часів Київської Русі. "
                    + "Тоді роль державного гімну – в сьогоднішньому розумінні – виконували бойові заклики та пісні, "
                    + "які створювали патріотичний настрій перед битвами. "
                    + "Як свідчить \"Слово о полку Ігоревім\", пісні закликали воїнів до хоробрості, "
                    + "аби здобути \"князю славу\", відплатити ворогам \"за землю Руську\", за рани.";
            findMostCommonWordInSentences(text);
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }

    private static void findMostCommonWordInSentences(String text) {
        validateText(text);

        String[] sentences = text.split("\\.\\s*"); 
        String[] words = preprocessText(text); 
        int maxCount = 0;
        String mostFrequentWord = "";
        String[] sentencesWithMostFrequentWord = new String[sentences.length];

    
        for (String word : words) {
            if (word.isEmpty()) continue;

            int count = 0;
            String[] tempSentences = new String[sentences.length];
            int tempIndex = 0;

            for (String sentence : sentences) {
                if (containsWord(sentence, word)) {
                    tempSentences[tempIndex++] = sentence.trim();
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
                sentencesWithMostFrequentWord = tempSentences;
            }
        }


        System.out.println("Найчастіше слово: " + mostFrequentWord);
        System.out.println("Кількість речень: " + maxCount);
        System.out.println("Речення:");
        for (String sentence : sentencesWithMostFrequentWord) {
            if (sentence != null) {
                System.out.println("- " + sentence);
            }
        }
    }

    private static boolean containsWord(String sentence, String word) {
        String[] wordsInSentence = preprocessText(sentence);
        for (String w : wordsInSentence) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }

    private static void validateText(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Текст не може бути порожнім або null.");
        }
    }

    private static String[] preprocessText(String text) {
        String textWithoutPunctuation = text.replaceAll("[^а-яА-ЯїЇєЄґҐіІ\\s]", "").toLowerCase(); 
        return textWithoutPunctuation.split("\\s+");
    }
}
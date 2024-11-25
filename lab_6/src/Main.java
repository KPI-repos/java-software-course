// --- [Варіант 15] ---

// -- C2 = 7 ~ 1
// Set

// -- C3 = 5 ~ 1
// Однозв’язний список

/**
 * Main class to demonstrate the functionality of the Gift program.
 */
public class Main {
    public static void main(String[] args) {
        GiftCollection giftCollection = new GiftCollection();

        // Add Sweet objects
        giftCollection.add(new Sweet("Lollipop", 50, 0.5));
        giftCollection.add(new Sweet("Dark Chocolate", 100, 2.5));
        giftCollection.add(new Sweet("Oatmeal Cookie", 30, 1.0));

        // Display all sweets in the collection
        System.out.println("Sweets in the collection:");
        for (Sweet sweet : giftCollection) {
            System.out.println(sweet);
        }

        // Check size
        System.out.println("\nTotal sweets: " + giftCollection.size());

        // Check if the collection contains a specific sweet
        Sweet query = new Sweet("Dark Chocolate", 100, 2.5);
        System.out.println("Contains 'Dark Chocolate': " + giftCollection.contains(query));

        // Remove a sweet
        giftCollection.remove(new Sweet("Lollipop", 50, 0.5));
        System.out.println("\nAfter removing 'Lollipop':");
        for (Sweet sweet : giftCollection) {
            System.out.println(sweet);
        }

        // Clear the collection
        giftCollection.clear();
        System.out.println("\nAfter clearing, collection size: " + giftCollection.size());
    }
}




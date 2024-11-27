// --- [Варіант 15] ---

// -- C13 = 1
// Визначити ієрархію цукерок та інших солодощів.
// Створити кілька об'єктів-цукерок.
// Зібрати дитячий подарунок з визначенням його ваги.
// Провести сортування цукерок у подарунку за одним із параметрів.
// Знайти цукерку в подарунку, що відповідає заданому діапазону вмісту шоколаду в цукерці.


/**
 * Main class to demonstrate the functionality of the Gift program.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Create a new gift
            Gift gift = new Gift();

            // Add a variety of sweets to the gift
            gift.addSweet(new Candy("Lollipop", 50, 0.5, "Cherry"));
            gift.addSweet(new ChocolateBar("Dark Chocolate", 100, 2.5, 75));
            gift.addSweet(new Cookie("Oatmeal Cookie", 30, 1.0, true));
            gift.addSweet(new Candy("Caramel Candy", 25, 0.3, "Caramel"));
            gift.addSweet(new ChocolateBar("Milk Chocolate", 80, 1.8, 40));

            // Display the contents of the gift
            System.out.println("Sweets in the gift:");
            gift.displaySweets();

            // Calculate and display the total weight of the gift
            double totalWeight = gift.calculateTotalWeight();
            System.out.printf("\nTotal weight of the gift: %.2f grams\n", totalWeight);

            // Sort the sweets by price and display the sorted list
            System.out.println("\nSweets sorted by price:");
            gift.sortByPrice();
            gift.displaySweets();

            // Find and display sweets that fall within the specified cocoa percentage range
            double minCocoa = 30;
            double maxCocoa = 80;
            System.out.printf("\nSweets with cocoa percentage between %.1f%% and %.1f%%:\n", minCocoa, maxCocoa);
            var sweetsInRange = gift.findSweetsByChocolateRange(minCocoa, maxCocoa);
            if (sweetsInRange.isEmpty()) {
                System.out.println("No sweets found in the specified cocoa range.");
            } else {
                sweetsInRange.forEach(System.out::println);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}


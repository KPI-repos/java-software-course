import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection of sweets in a gift.
 * This class allows adding sweets, calculating total weight,
 * sorting by price, and finding sweets within a specified price range.
 */
class Gift {
    // List to store various sweets in the gift
    private List<Sweet> sweets;

    /**
     * Default constructor to initialize the gift.
     * Creates an empty collection of sweets.
     */
    public Gift() {
        this.sweets = new ArrayList<>();
    }

    /**
     * Adds a sweet to the gift collection.
     *
     * @param sweet the sweet to add to the gift
     * @throws IllegalArgumentException if the sweet is null
     */
    public void addSweet(Sweet sweet) {
        if (sweet == null) {
            throw new IllegalArgumentException("Sweet cannot be null.");
        }
        sweets.add(sweet);
    }

    /**
     * Calculates the total weight of all sweets in the gift.
     *
     * @return the total weight of the gift in grams
     */
    public double calculateTotalWeight() {
        return sweets.stream()
                .mapToDouble(Sweet::getWeight) // Extracts the weight of each sweet
                .sum(); // Sums up all weights
    }

    /**
     * Sorts the sweets in the gift by price in ascending order.
     * Uses the natural order of the price for sorting.
     */
    public void sortByPrice() {
        sweets.sort((s1, s2) -> Double.compare(s1.getPrice(), s2.getPrice()));
    }

    
    /**
     * Finds sweets within a specified cocoa percentage range.
     *
     * @param minCocoa the minimum cocoa percentage
     * @param maxCocoa the maximum cocoa percentage
     * @return a list of sweets that are ChocolateBars within the specified cocoa range
     */
    public List<Sweet> findSweetsByChocolateRange(double minCocoa, double maxCocoa) {
        List<Sweet> result = new ArrayList<>();
        for (Sweet sweet : sweets) {
            if (sweet instanceof ChocolateBar) {
                ChocolateBar chocolate = (ChocolateBar) sweet;
                if (chocolate.getCocoaPercentage() >= minCocoa && chocolate.getCocoaPercentage() <= maxCocoa) {
                    result.add(chocolate);
                }
            }
        }
        return result;
    }

    /**
     * Displays the details of all sweets in the gift.
     * Each sweet is printed to the console.
     */
    public void displaySweets() {
        sweets.forEach(System.out::println);
    }
}

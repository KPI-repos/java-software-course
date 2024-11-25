/**
 * Generalized class representing a sweet item.
 */
public class Sweet {
    private String name; // The name of the sweet item
    private double weight; // The weight of the sweet in grams
    private double price;  // The price of the sweet in USD

    /**
     * Constructor for the Sweet class.
     *
     * @param name   the name of the sweet
     * @param weight the weight of the sweet in grams
     * @param price  the price of the sweet in USD
     */
    public Sweet(String name, double weight, double price) {
        if (weight <= 0 || price < 0) {
            throw new IllegalArgumentException("Weight and price must be positive.");
        }
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    /**
     * Returns the name of the sweet.
     *
     * @return the name of the sweet
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the weight of the sweet.
     *
     * @return the weight of the sweet in grams
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns the price of the sweet.
     *
     * @return the price of the sweet in USD
     */
    public double getPrice() {
        return price;
    }


    /**
     * Returns a string representation of the sweet.
     *
     * @return a formatted string containing the name, type, weight, and price of the sweet
     */
    @Override
    public String toString() {
        return String.format("%s [Weight: %.2f g, Price: $%.2f]", name, weight, price);
    }
}

/**
 * Subclass representing a chocolate bar.
 */
class ChocolateBar extends Sweet {
    private double cocoaPercentage; // in percentage

    /**
     * Constructor for the ChocolateBar class.
     *
     * @param name            the name of the chocolate bar
     * @param weight          the weight of the chocolate bar in grams
     * @param price           the price of the chocolate bar in USD
     * @param cocoaPercentage the cocoa content in percentage
     */
    public ChocolateBar(String name, double weight, double price, double cocoaPercentage) {
        super(name, weight, price);
        if (cocoaPercentage < 0 || cocoaPercentage > 100) {
            throw new IllegalArgumentException("Cocoa percentage must be between 0 and 100.");
        }
        this.cocoaPercentage = cocoaPercentage;
    }

    /**
     * Returns the cocoa percentage of the chocolate bar.
     *
     * @return the cocoa content in percentage
     */
    public double getCocoaPercentage() {
        return cocoaPercentage;
    }

    /**
     * Returns the type of the sweet, which is "Chocolate Bar".
     *
     * @return the type of the sweet
     */
    @Override
    public String getType() {
        return "Chocolate Bar";
    }

    /**
     * Returns a string representation of the chocolate bar.
     *
     * @return a string containing the name, type, weight, price, and cocoa percentage of the chocolate bar
     */
    @Override
    public String toString() {
        return super.toString() + ", Cocoa: " + cocoaPercentage + "%";
    }
}

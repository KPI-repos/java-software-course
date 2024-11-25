/**
 * Subclass representing candy.
 */
class Candy extends Sweet {
    private String flavor;

    /**
     * Constructor for the Candy class.
     *
     * @param name   the name of the candy
     * @param weight the weight of the candy in grams
     * @param price  the price of the candy in USD
     * @param flavor the flavor of the candy
     */
    public Candy(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    /**
     * Returns the flavor of the candy.
     *
     * @return the flavor of the candy
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Returns the type of the sweet.
     *
     * @return the type of the sweet, which is "Candy"
     */
    @Override
    public String getType() {
        return "Candy";
    }

    /**
     * Returns a string representation of the candy.
     *
     * @return a string containing the name, type, weight, price, and flavor of the candy
     */
    @Override
    public String toString() {
        return super.toString() + ", Flavor: " + flavor;
    }
}

/**
 * Subclass representing a cookie.
 */
class Cookie extends Sweet {
    private boolean containsNuts;

    /**
     * Constructor for the Cookie class.
     *
     * @param name         the name of the cookie
     * @param weight       the weight of the cookie in grams
     * @param price        the price of the cookie in USD
     * @param containsNuts true if the cookie contains nuts, false otherwise
     */
    public Cookie(String name, double weight, double price, boolean containsNuts) {
        super(name, weight, price);
        this.containsNuts = containsNuts;
    }

    /**
     * Checks if the cookie contains nuts.
     *
     * @return true if the cookie contains nuts, false otherwise
     */
    public boolean isContainsNuts() {
        return containsNuts;
    }

    /**
     * Returns the type of sweet.
     *
     * @return the type of sweet as a string
     */
    @Override
    public String getType() {
        return "Cookie";
    }

    /**
     * Returns a string representation of the cookie.
     *
     * @return a string describing the cookie
     */
    @Override
    public String toString() {
        return super.toString() + ", Contains Nuts: " + containsNuts;
    }
}

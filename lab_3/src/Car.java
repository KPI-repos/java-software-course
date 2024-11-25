/**
 * Car class represents a vehicle with basic characteristics.
 */
class Car {
    private String brand;      
    private String model;       
    private int year;           
    private double engineSize;  
    private String color;       

    /**
     * Constructor for the Car class.
     *
     * @param brand      Brand of the car (e.g., "Toyota", "Ford")
     * @param model      Model of the car (e.g., "Camry", "Mustang")
     * @param year       Year of manufacture (e.g., 2020, 2021)
     * @param engineSize Engine size in liters (e.g., 2.0, 3.5)
     * @param color      Color of the car (e.g., "Red", "Blue")
     */
    public Car(String brand, String model, int year, double engineSize, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineSize = engineSize;
        this.color = color;
    }

    /**
     * Gets the brand of the car.
     *
     * @return the brand of the car
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the brand of the car.
     *
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets the model of the car.
     *
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the car.
     *
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the year of manufacture of the car.
     *
     * @return the year of manufacture
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of manufacture of the car.
     *
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets the engine size of the car.
     *
     * @return the engine size in liters
     */
    public double getEngineSize() {
        return engineSize;
    }

    /**
     * Sets the engine size of the car.
     *
     * @param engineSize the engine size to set
     */
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    /**
     * Gets the color of the car.
     *
     * @return the color of the car
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the car.
     *
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine size: " + engineSize + " L");
        System.out.println("Color: " + color);
    }

    /**
     * Override equals method to compare Car objects.
     *
     * @param obj Object to compare with
     * @return true if objects are equal, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return year == car.year &&
                Double.compare(car.engineSize, engineSize) == 0 &&
                brand.equals(car.brand) &&
                model.equals(car.model) &&
                color.equals(car.color);
    }
}
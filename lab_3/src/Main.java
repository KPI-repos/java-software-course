import java.util.Arrays;
import java.util.Comparator;
// --- [Варіант 15] ---  

// -- C11 = 1
//C = Визначити клас автомобіль, який складається як мінімум з 5-и полів.

/**
 * Main class to demonstrate working with an array of Car objects.
 */
public class Main {
    public static void main(String[] args) {
        // Array of Car objects
        Car[] cars = {
                new Car("Toyota", "Camry", 2020, 2.5, "Black"),
                new Car("Honda", "Civic", 2018, 1.8, "Silver"),
                new Car("Ford", "Focus", 2022, 2.0, "Blue"),
                new Car("Tesla", "Model 3", 2021, 0.0, "Red"),
                new Car("BMW", "X5", 2019, 3.0, "White")
        };

        // Print the initial array
        System.out.println("Initial array:");
        for (Car car : cars) {
            car.displayInfo();
            System.out.println();
        }

        // Sort the array by year (ascending) and engine size (descending)
        Arrays.sort(cars, Comparator
                .comparingInt(Car::getYear) // Sort by year (ascending)
                .thenComparing((car1, car2) -> Double.compare(car2.getEngineSize(), car1.getEngineSize()))); // Sort by engine size (descending)

        // Print the sorted array
        System.out.println("Sorted array:");
        for (Car car : cars) {
            car.displayInfo();
            System.out.println();
        }

        // Target object for searching
        Car targetCar = new Car("Tesla", "Model 3", 2021, 0.0, "Red");

        // Search for the identical object
        boolean found = false;
        for (Car car : cars) {
            if (car.equals(targetCar)) {
                System.out.println("Identical object found:");
                car.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No identical object found.");
        }
    }
}
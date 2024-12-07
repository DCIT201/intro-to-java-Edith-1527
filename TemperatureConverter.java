import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu options to the user
        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = 0;

        // Validate user input for menu choice
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break; // Valid choice, exit loop
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Prompt for temperature input based on user's choice
        double temperature = 0.0;
        while (true) {
            System.out.print("Enter the temperature value: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break; // Valid temperature, exit loop
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform conversion based on user's choice and display result
        if (choice == 1) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", temperature, fahrenheit);
        } else {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", temperature, celsius);
        }

        // Close the scanner resource
        scanner.close();
    }

    // Method to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1/2): ");
        int choice = scan.nextInt();

        int temperature;
        int convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scan.nextInt();
                convertedTemperature = TempConverter.celsiusToFahrenheit(temperature);
                System.out.println(String.format("Converted temperature in Fahrenheit: %d \u00b0F", convertedTemperature));
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scan.nextInt();
                convertedTemperature = TempConverter.fahrenheitToCelsius(temperature);
                System.out.println(String.format("Converted temperature in Celsius: %d \u00b0C", convertedTemperature));
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scan.close();
    }
}

public class TempConverter {

    public static int celsiusToFahrenheit(int celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit to Celsius conversion
    public static int fahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

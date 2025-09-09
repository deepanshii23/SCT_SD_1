import java.util.Scanner;

public class TemperatureConversion {

    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option: ");
        
        int choice = sc.nextInt();
        double inputTemp, result;

        switch (choice) {
            case 1:
                System.out.print("Enter Celsius: ");
                inputTemp = sc.nextDouble();
                result = celsiusToFahrenheit(inputTemp);
                System.out.println("Fahrenheit: " + result);
                break;

            case 2:
                System.out.print("Enter Celsius: ");
                inputTemp = sc.nextDouble();
                result = celsiusToKelvin(inputTemp);
                System.out.println("Kelvin: " + result);
                break;

            case 3:
                System.out.print("Enter Fahrenheit: ");
                inputTemp = sc.nextDouble();
                result = fahrenheitToCelsius(inputTemp);
                System.out.println("Celsius: " + result);
                break;

            case 4:
                System.out.print("Enter Fahrenheit: ");
                inputTemp = sc.nextDouble();
                result = fahrenheitToKelvin(inputTemp);
                System.out.println("Kelvin: " + result);
                break;

            case 5:
                System.out.print("Enter Kelvin: ");
                inputTemp = sc.nextDouble();
                result = kelvinToCelsius(inputTemp);
                System.out.println("Celsius: " + result);
                break;

            case 6:
                System.out.print("Enter Kelvin: ");
                inputTemp = sc.nextDouble();
                result = kelvinToFahrenheit(inputTemp);
                System.out.println("Fahrenheit: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

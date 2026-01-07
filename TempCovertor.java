import java.util.Scanner;

public class TempCovertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nTemperature Converter");
            System.out.println("1) Celsius -> Fahrenheit");
            System.out.println("2) Fahrenheit -> Celsius");
            System.out.println("3) Exit");
            System.out.print("Choose an option (1-3): ");

            String choice = sc.nextLine().trim();
            if (choice.equals("3")) {
                System.out.println("Goodbye.");
                break;
            }

            try {
                switch (choice) {
                    case "1": {
                        System.out.print("Enter temperature in Celsius: ");
                        double c = Double.parseDouble(sc.nextLine().trim());
                        double f = c * 9.0 / 5.0 + 32.0;
                        System.out.printf("%.2f °C = %.2f °F%n", c, f);
                        break;
                    }
                    case "2": {
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double f = Double.parseDouble(sc.nextLine().trim());
                        double c = (f - 32.0) * 5.0 / 9.0;
                        System.out.printf("%.2f °F = %.2f °C%n", f, c);
                        break;
                    }
                    default:
                        System.out.println("Invalid option. Please enter 1, 2 or 3.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number. Please try again.");
            }
        }
        sc.close();
    }
}
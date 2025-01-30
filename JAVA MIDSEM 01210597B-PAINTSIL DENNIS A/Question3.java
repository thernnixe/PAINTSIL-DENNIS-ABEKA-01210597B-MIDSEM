//Develop a java application to implement currency converter (Dollar to Gh, EURO to Gh, Yen to Gh and vice versa), distance converter (meter to KM, miles to KM and vice versa) , time converter (hours to minutes, seconds and vice versa) using packages.


import java.util.Scanner;

public class Question3 {
    
    
    static class CurrencyConverter {
        public static double dollarToGhanaCedis(double dollars) {
            return dollars * 6.0; 
        }

        public static double euroToGhanaCedis(double euros) {
            return euros * 7.2; 
        }

        public static double yenToGhanaCedis(double yen) {
            return yen * 0.058; 
        }

        public static double ghanaCedisToDollar(double cedis) {
            return cedis / 6.0; 
        }

        public static double ghanaCedisToEuro(double cedis) {
            return cedis / 7.2; 
        }

        public static double ghanaCedisToYen(double cedis) {
            return cedis / 0.058;  
        }
    }

    
    static class DistanceConverter {
        public static double metersToKilometers(double meters) {
            return meters / 1000.0;
        }

        public static double kilometersToMeters(double kilometers) {
            return kilometers * 1000.0;
        }

        public static double milesToKilometers(double miles) {
            return miles * 1.60934;
        }

        public static double kilometersToMiles(double kilometers) {
            return kilometers / 1.60934;
        }
    }

    // Time Converter
    static class TimeConverter {
        public static int hoursToMinutes(int hours) {
            return hours * 60;
        }

        public static int minutesToHours(int minutes) {
            return minutes / 60;
        }

        public static int hoursToSeconds(int hours) {
            return hours * 3600;
        }

        public static int secondsToHours(int seconds) {
            return seconds / 3600;
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Converter App!");
        System.out.println("Select the type of conversion:");
        System.out.println("1. Currency Converter");
        System.out.println("2. Distance Converter");
        System.out.println("3. Time Converter");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Currency Converter Menu:");
                System.out.println("1. Dollar to Ghana Cedis");
                System.out.println("2. Euro to Ghana Cedis");
                System.out.println("3. Yen to Ghana Cedis");
                System.out.println("4. Ghana Cedis to Dollar");
                System.out.println("5. Ghana Cedis to Euro");
                System.out.println("6. Ghana Cedis to Yen");
                System.out.print("Enter your choice (1-6): ");
                int currencyChoice = scanner.nextInt();
                System.out.print("Enter the amount: ");
                double amount = scanner.nextDouble();
                switch (currencyChoice) {
                    case 1 -> System.out.println("Converted: " + CurrencyConverter.dollarToGhanaCedis(amount) + " GHS");
                    case 2 -> System.out.println("Converted: " + CurrencyConverter.euroToGhanaCedis(amount) + " GHS");
                    case 3 -> System.out.println("Converted: " + CurrencyConverter.yenToGhanaCedis(amount) + " GHS");
                    case 4 -> System.out.println("Converted: " + CurrencyConverter.ghanaCedisToDollar(amount) + " USD");
                    case 5 -> System.out.println("Converted: " + CurrencyConverter.ghanaCedisToEuro(amount) + " EUR");
                    case 6 -> System.out.println("Converted: " + CurrencyConverter.ghanaCedisToYen(amount) + " JPY");
                    default -> System.out.println("Invalid choice!");
                }
            }
            case 2 -> {
                System.out.println("Distance Converter Menu:");
                System.out.println("1. Meters to Kilometers");
                System.out.println("2. Kilometers to Meters");
                System.out.println("3. Miles to Kilometers");
                System.out.println("4. Kilometers to Miles");
                System.out.print("Enter your choice (1-4): ");
                int distanceChoice = scanner.nextInt();
                System.out.print("Enter the distance: ");
                double distance = scanner.nextDouble();
                switch (distanceChoice) {
                    case 1 -> System.out.println("Converted: " + DistanceConverter.metersToKilometers(distance) + " KM");
                    case 2 -> System.out.println("Converted: " + DistanceConverter.kilometersToMeters(distance) + " M");
                    case 3 -> System.out.println("Converted: " + DistanceConverter.milesToKilometers(distance) + " KM");
                    case 4 -> System.out.println("Converted: " + DistanceConverter.kilometersToMiles(distance) + " Miles");
                    default -> System.out.println("Invalid choice!");
                }
            }
            case 3 -> {
                System.out.println("Time Converter Menu:");
                System.out.println("1. Hours to Minutes");
                System.out.println("2. Minutes to Hours");
                System.out.println("3. Hours to Seconds");
                System.out.println("4. Seconds to Hours");
                System.out.print("Enter your choice (1-4): ");
                int timeChoice = scanner.nextInt();
                System.out.print("Enter the time value: ");
                int time = scanner.nextInt();
                switch (timeChoice) {
                    case 1 -> System.out.println("Converted: " + TimeConverter.hoursToMinutes(time) + " Minutes");
                    case 2 -> System.out.println("Converted: " + TimeConverter.minutesToHours(time) + " Hours");
                    case 3 -> System.out.println("Converted: " + TimeConverter.hoursToSeconds(time) + " Seconds");
                    case 4 -> System.out.println("Converted: " + TimeConverter.secondsToHours(time) + " Hours");
                    default -> System.out.println("Invalid choice!");
                }
            }
            default -> System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

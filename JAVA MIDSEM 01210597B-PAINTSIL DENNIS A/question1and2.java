
import java.util.Scanner;
public class question1and2 {
 

    public static void main(String[] args) {

        String consumerName, connectionType;
        int consumerNumber;
        double previousMonthReading, currentMonthReading, electricityBill;

        System.out.println("Enter the following data respectively:");
        System.out.println("What is the consumer name?");
        System.out.println("What is the consumer number?");
        System.out.println("Previous month reading?");
        System.out.println("Current month reading?");

        Scanner data = new Scanner(System.in);

        consumerName = data.next();
        consumerNumber = data.nextInt();
        previousMonthReading = data.nextDouble();
        currentMonthReading = data.nextDouble();

        double unitsConsumed = currentMonthReading - previousMonthReading;

        System.out.println("What is the type of connection made? Is it domestic or commercial?");
        connectionType = data.next();

        double billAmount = 0.0;

        switch (connectionType.toLowerCase()) {
            case "domestic":
                billAmount = calculateDomesticbill(unitsConsumed);
                break;
            case "commercial":
                billAmount = calculateCommercial(unitsConsumed);
                break;
            default:
                System.out.println("Invalid connection type.");
                return;
        }

        electricityBill = billAmount;

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("----------------------------------------------");
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Previous Month Reading: " + previousMonthReading);
        System.out.println("Current Month Reading: " + currentMonthReading);
        System.out.println("Amount to be Paid: $" + electricityBill);

        data.close();
    }

    private static double calculateDomesticbill(double units) {
        double amount = 0.0;
        if (units <= 100) {
            amount = units * 1;
        } else if (units <= 200) {
            amount = 100 * 1 + (units - 100) * 2.50;
        } else if (units <= 500) {
            amount = 100 * 1 + 100 * 2.50 + (units - 200) * 4;
        } else {
            amount = 100 * 1 + 100 * 2.50 + 300 * 4 + (units - 500) * 6;
        }
        return amount;
    }

    private static double calculateCommercial(double units) {
        double amount = 0.0;
        if (units <= 100) {
            amount = units * 2;
        } else if (units <= 200) {
            amount = 100 * 2 + (units - 100) * 4.50;
        } else if (units <= 500) {
            amount = 100 * 2 + 100 * 4.50 + (units - 200) * 6;
        } else {
            amount = 100 * 2 + 100 * 4.50 + 300 * 6 + (units - 500) * 7;
        }
        return amount;
    }
}




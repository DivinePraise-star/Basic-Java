import java.util.Scanner;

public class Business {
    public static final int CityCouncilTax = 1000;
    public int Rent;
}

class TimberStore extends Business {
    public int timberPieces;
    public int timberPrice;

    public int getDailyIncome(int timberPieces, int timberPrice) {
        return (timberPrice * timberPieces) - CityCouncilTax;
    }
}

class UnisexSalon extends Business {
    public int servicePrice;
    public int numberOfCustomers;
    public double powerBill;

    public int getDailyIncome(int servicePrice, int numberOfCustomers, double powerBill) {
        return (servicePrice * numberOfCustomers) - ((int) powerBill + CityCouncilTax);
    }
}

class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TimberStore TS = new TimberStore();
        UnisexSalon US = new UnisexSalon();

        // Timber Store input
        System.out.print("Enter number of timber pieces: ");
        int timberPieces = input.nextInt();
        System.out.print("Enter timber price: ");
        int timberPrice = input.nextInt();

        // Calculate daily income for Timber Store
        System.out.println("The daily income of the timber store is shs. " + TS.getDailyIncome(timberPieces, timberPrice));

        // Unisex Salon input
        System.out.print("Enter service price: ");
        int servicePrice = input.nextInt();
        System.out.print("Enter number of customers: ");
        int numberOfCustomers = input.nextInt();
        System.out.print("Enter power bill: ");
        double powerBill = input.nextDouble();

        // Calculate daily income for Unisex Salon
        System.out.println("The daily income of the salon is shs. " + US.getDailyIncome(servicePrice, numberOfCustomers, powerBill));

        input.close(); // Close the scanner
    }
}
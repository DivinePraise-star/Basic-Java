public class Guest {
    public String GuestID;
    public String GuestName;
    public int Days;

    public void displayDetails(){
        System.out.println("Guest ID: "+this.GuestID+"\nGuest name: "+this.GuestName+"\nDays stayed: "+this.Days);
    }
}
/*public class Guest {
    public String GuestID;
    public String GuestName;
    public int Days;

    public void displayDetails(){
        System.out.println("Guest ID: " + this.GuestID + "\n Guest name: " + this.GuestName + "\n Days stayed: " + this.Days);
    }
}

import java.util.Scanner;

public class Resident extends Guest {
    public float RoomFees;
    public static final int MunicipalFee = 30;

    public float getAmount() {
        return (super.Days * this.RoomFees) + MunicipalFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The resident guest amount: " + getAmount());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the guest ID: ");
        String guestID = input.nextLine();

        System.out.print("Enter the guest name: ");
        String guestName = input.nextLine();

        System.out.print("Enter the room fee: ");
        float roomFee = input.nextFloat();
        input.nextLine(); // Consume newline

        System.out.print("Enter the days stayed: ");
        int days = input.nextInt();
        input.nextLine(); // Consume newline

        Resident peter = new Resident();
        peter.GuestID = guestID;
        peter.GuestName = guestName;
        peter.RoomFees = roomFee;
        peter.Days = days;

        peter.displayDetails();
    }
}

import java.util.Scanner;

public class NonResident extends Guest {
    public int EntranceFee;

    public float getAmount() { // Changed to return a float
        return super.Days * EntranceFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Non-Resident Amount: " + getAmount()); //Print the amount in displayDetails
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the guest ID: ");
        String guestID = input.nextLine();

        System.out.print("Enter the guest name: ");
        String guestName = input.nextLine();

        System.out.print("Enter the entrance fee: ");
        int entranceFee = input.nextInt();
        input.nextLine(); // Consume newline

        System.out.print("Enter the days stayed: ");
        int days = input.nextInt();
        input.nextLine(); // Consume newline

        NonResident peter = new NonResident();
        peter.GuestID = guestID;
        peter.GuestName = guestName;
        peter.EntranceFee = entranceFee;
        peter.Days = days;

        peter.displayDetails();
    }
}*/



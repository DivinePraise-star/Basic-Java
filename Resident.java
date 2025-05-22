import java.util.Scanner;

public class Resident extends Guest{
    public float RoomFees;
    public static final int MunicipalFee=30;

    public void getAmount(){
        System.out.println("The resident guest amount: "+((this.Days*this.RoomFees)*Resident.MunicipalFee));
    }
      @Override
    public void displayDetails() {
        System.out.println("\n......The guest`s details......");
        super.displayDetails();
        getAmount();

    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the guest ID: ");
        String GuestID=input.nextLine();
        System.out.print("Enter the guest name: ");
        String GuestName=input.nextLine();
        System.out.print("Enter the room fee: ");
        float RoomFees=input.nextFloat();
        input.nextLine();
        System.out.print("Enter the days stayed: ");
        int Days=input.nextInt();
        input.nextLine();

        Resident resident=new Resident();
        resident.GuestID=GuestID;
        resident.GuestName=GuestName;
        resident.RoomFees=RoomFees;
        resident.Days=Days;
        resident.displayDetails();
    }
}

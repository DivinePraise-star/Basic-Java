import java.util.Scanner;

public class NonResident extends Guest{
    public int EntranceFee;

    public void getAmount(){
        System.out.println("The nonresident`s amount is "+(this.EntranceFee));
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
        System.out.print("Enter the entrance fee: ");
        int EntranceFees=input.nextInt();
        input.nextLine();

        NonResident nonresident=new NonResident();
        nonresident.GuestID=GuestID;
        nonresident.GuestName=GuestName;
        nonresident.EntranceFee=EntranceFees;
        nonresident.displayDetails();
    }

}

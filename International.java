import java.util.Scanner;

public class International extends Guests{
    public int foreignerFee;

    public int getAmount(){
        return (serviceCharge+Tax+foreignerFee);
    }
    @Override
    public void displayDetails(){
        System.out.println("\n......The guest`s details......");
        super.displayDetails();
        System.out.println("The foreigner fee: "+foreignerFee+"\nThe international guest pays amount: "+getAmount());
    }
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the guest name: ");
        String Name = input.nextLine();
        System.out.print("Enter the contact: ");
        String Contact = input.nextLine();
        System.out.print("Enter the service(s) consumed: ");
        String serviceConsumed = input.nextLine();
        System.out.print("Enter service(s) charge: ");
        int serviceCharge = input.nextInt();
        input.nextLine();
        System.out.print("Enter foreigner fee: ");
        int foreignerFee = input.nextInt();
        input.nextLine();

        International guest = new International();
        guest.Name = Name;
        guest.Contact = Contact;
        guest.serviceConsumed = serviceConsumed;
        guest.serviceCharge = serviceCharge;
        guest.foreignerFee=foreignerFee;
        guest.displayDetails();

        input.close();
    }
}
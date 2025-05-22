import java.util.Scanner;

public class Local extends Guests{
    public static float discountRate;

    public float getAmount(){
        return (serviceCharge*discountRate)+Tax;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n......The guest`s details......");
        super.displayDetails();
        System.out.println("The local guest`s amount: "+getAmount());
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the guest name: ");
        String Name=input.nextLine();
        System.out.print("Enter the contact: ");
        String Contact=input.nextLine();
        System.out.print("Enter the service(s) consumed: ");
        String serviceConsumed=input.nextLine();
        System.out.print("Enter service(s) charge: ");
        int serviceCharge=input.nextInt();
        input.nextLine();
        System.out.print("Enter discount rate: ");
        discountRate=input.nextFloat();
        input.nextLine();

        Local guest=new Local();
        guest.Name=Name;
        guest.Contact=Contact;
        guest.serviceConsumed=serviceConsumed;
        guest.serviceCharge=serviceCharge;
        guest.displayDetails();

      input.close();
    }
}


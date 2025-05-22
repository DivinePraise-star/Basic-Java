import java.util.Scanner;

public class ExternalOrder extends Order{
    public String CustomerContact;
    @Override
    public void printOrder(){
        System.out.println(".....Product Details......");
        System.out.println("OrderID: "+OrderID+"\nProduct Name: "+ProductOrdered+"\nQuantity ordered: "+ProductQuantity+"\nCustomer contact: "+CustomerContact);
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter orderId: ");
        String OrderID=input.nextLine();
        System.out.print("Enter product order: ");
        String ProductOrder=input.nextLine();
        System.out.print("Enter order quantity: ");
        int ProductQuantity=input.nextInt();
        input.nextLine();
        System.out.print("Enter customer contact: ");
        String CustomerContact=input.nextLine();

        ExternalOrder order=new ExternalOrder();
        order.OrderID=OrderID;
        order.ProductOrdered=ProductOrder;
        order.ProductQuantity=ProductQuantity;
        order.CustomerContact=CustomerContact;
        order.printOrder();
    }
}

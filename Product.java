import java.util.Scanner;

public class Product {
    public String Name;
    public int Quantity;
    public int Price;
    public static final int taxFee=350;

    public int getIncome(){
        return (this.Quantity*this.Price)-taxFee;
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

            System.out.print("Enter product name: ");
            String Name=input.nextLine();

            System.out.print("Enter the quantity: ");
            int Quantity=input.nextInt();
            input.nextLine();

            System.out.print("Enter the price: ");
            int Price=input.nextInt();

            Product product=new Product();
            product.Name=Name;
            product.Quantity=Quantity;
            product.Price=Price;

        System.out.println("........The Details of the Product........");
        System.out.println("Product name: "+Name+"\nProduct quantity: "+Quantity+"\nProduct price: "+Price+"\nTotal sale: "+product.getIncome());
    input.close();
    }
}


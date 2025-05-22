import java.util.Scanner;

public class Products {
    public String prodName;
    public int price;
    public int quantity;
    public static final int tax=500;
    public static String supplierName;

    public int getSale(){
        return (this.quantity*this.price)+Products.tax;
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Supplier Name: ");
        supplierName=input.nextLine();
        input.nextLine();

        Products[]products=new Products[2];
        for(int i=0; i< products.length; i++){
            products[i]=new Products();

            System.out.print("Enter Product Name: ");
            products[i].prodName=input.nextLine();
            input.nextLine();
            System.out.print("Enter Price: ");
            products[i].price=input.nextInt();
            input.nextLine();
            System.out.print("Enter Quantity: ");
            products[i].quantity=input.nextInt();
            input.nextLine();

        }
        System.out.println("Below are details of the sale: ");
        for(Products pro_duct: products){
            System.out.println(pro_duct.prodName+"  "+ pro_duct.quantity+"  "+pro_duct.price+"  "+pro_duct.getSale());
        }

    }
}

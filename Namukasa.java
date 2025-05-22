import java.util.Scanner;

public class Namukasa implements Businesz{
    @Override
    public void expenditure(int Rent){
        System.out.println(Rent+License);
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value for rent: ");
        int Rent=input.nextInt();

        Namukasa N=new Namukasa();
        N.printSlogan("Customer is my boss");
        Businesz.printAddress("Room L20 ABC Mall");
        N.expenditure(Rent);


    }
}

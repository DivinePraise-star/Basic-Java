import java.util.Scanner;
public class Payment {
    public String WorkerName;
    public int daysWorked;
    public static int rate;

    public int getPayment(){
        return (this.daysWorked*Payment.rate);
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter value for rate: ");
        rate=input.nextInt();

        Payment[]payment=new Payment[5];
        for(int i=0;i<5;i++) {
            payment[i] = new Payment();
            System.out.print("Enter worker`s name: ");
            payment[i].WorkerName = input.nextLine();
            input.nextLine();
            System.out.print("Enter days worked: ");
            payment[i].daysWorked = input.nextInt();
            input.nextLine();
        }
        System.out.println("Payment Details");
        for(Payment pay : payment){
            System.out.println(pay.WorkerName+" "+pay.daysWorked+" "+pay.getPayment());
        }
    }
}

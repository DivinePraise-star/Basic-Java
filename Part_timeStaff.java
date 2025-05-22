import java.util.Scanner;

public class Part_timeStaff extends Staff{
    public int HoursWorked;
    public static final int Rate=2500;
    public static final double Tax=0.3;

    public double getNetPay(){
        //Assume a month has 30 days
        return (HoursWorked*Rate*30)-Tax;
    }

    @Override
    public void printDetails(){
        System.out.println("........Staff Details........");
        super.printDetails();
        System.out.println("The net pay of the part-time staff is "+getNetPay()+", worked for "+HoursWorked+" hours.ss");
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter staffNo: ");
        String StaffNo=input.nextLine();
        System.out.print("Enter staff Name: ");
        String StaffName=input.nextLine();
        System.out.print("Enter staff Age: ");
        int StaffAge=input.nextInt();
        input.nextLine();
        System.out.print("Enter hours worked: ");
        int HoursWorked=input.nextInt();
        input.nextLine();

        Part_timeStaff staff=new Part_timeStaff();
        staff.StaffNo=StaffNo;
        staff.StaffName=StaffName;
        staff.StaffAge=StaffAge;
        staff.HoursWorked=HoursWorked;

        staff.printDetails();

    }
}

import java.util.Scanner;

public class Full_timeStaff extends Staff{
    public float BasicSalary;
    public double Deductions;

    public double getNetPay(){
        return (BasicSalary-Deductions);
    }
    @Override
    public void printDetails(){
        System.out.println("........Staff Details........");
        super.printDetails();
        System.out.println("The net pay of the Full-time staff is "+getNetPay());
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
        System.out.print("Enter basic salary: ");
        float BasicSalary=input.nextFloat();
        input.nextLine();
        System.out.print("Enter deductions: ");
        double Deductions=input.nextDouble();
        input.nextLine();

        Full_timeStaff staff=new Full_timeStaff();
        staff.StaffNo=StaffNo;
        staff.StaffName=StaffName;
        staff.StaffAge=StaffAge;
        staff.BasicSalary=BasicSalary;
        staff.Deductions=Deductions;

        staff.printDetails();

    }
}

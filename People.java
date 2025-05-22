import java.util.Scanner;
public class People {
    public String Name;
    public int Age;

    public void displayDetails(){
        System.out.println("Name: "+this.Name+"\nAge: "+this.Age);
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n=input.nextInt();

        People[]person=new People[n];
        for(int i=0;i<person.length;i++){
            person[i]=new People();
            System.out.print("Enter the person`s name: ");
            person[i].Name=input.nextLine();
            input.nextLine();
            System.out.print("Enter age: ");
            person[i].Age=input.nextInt();

        }
        System.out.println("Personal Details");
        for(People Person: person){
            Person.displayDetails();
        }
        input.close();
    }

}

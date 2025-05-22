import java.util.Scanner;
public class Book {
    String Title;
    String Author;
    String bookNumber;

    public void display(){
        System.out.println(Title+", "+Author+", "+bookNumber);
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of books : ");
        int n=input.nextInt();
        System.out.println("The number of the books is "+n);
        Book[]bk=new Book[n];
        for(int i=0;i<n;i++){
            bk[i]=new Book();
            System.out.print("Enter the book name"+(i+1)+" : ");
            bk[i].Title=input.nextLine();
            System.out.print("Enter the author name"+(i+1)+" : ");
            bk[i].Author=input.nextLine();
            System.out.print("Enter the book number"+(i+1)+" : ");
            bk[i].bookNumber=input.nextLine();

        }
        System.out.println("Book Details");
        for(Book book:bk){
            book.display();
        }
        input.close();
    }
}

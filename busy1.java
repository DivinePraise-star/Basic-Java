public class busy1 implements Businesz{
    @Override
    public void expenditure(int Rent){
        System.out.println("Business1 rent is "+(Rent+License));
    }
    public static void main(String[]args){
        busy1 Business1=new busy1();
        Business1.expenditure(250000);
        Business1.printSlogan("Customer is my boss");
        Businesz.printAddress("ABC12");
    }
}

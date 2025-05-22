public class busy2 implements Businesz{
    @Override
    public void expenditure(int Rent){
        System.out.println("Business1 expenditure is "+(Rent+License));
    }
    public static void main(String[]args){
        busy2 Business2=new busy2();
        Business2.expenditure(300000);
        Business2.printSlogan("Customer is my boss");
        Businesz.printAddress("ABC13");
    }
}

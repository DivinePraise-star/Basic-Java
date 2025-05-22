public class Sum {
    public void getSum(int a, int b){
        System.out.println("The sum of a and b is "+(a+b));
    }
    public void getSum(int a, int b,int c){
        System.out.println("The sum of a, b and c is "+(a+b+c));
    }

    public static void main(String[]args){
        Sum S=new Sum();
        S.getSum(2,5);
        S.getSum(2,4,5);
    }
}

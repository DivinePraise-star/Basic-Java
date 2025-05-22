public class P implements T, S{
    @Override
    public void mA(String A){
        System.out.println(A+T.K);
    }
    @Override
    public double mB(int b){
        return (b+S.K);
    }

    public static void main(String[]args){
        P p=new P();
        p.mA("This is the constant in T: ");
        System.out.println(p.mB(5));
        p.mD();
    }
}

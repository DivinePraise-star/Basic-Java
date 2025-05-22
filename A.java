public class A implements Z{
    @Override
    public double mX(int KX){
        return KX+Z.KZ;
    }
    @Override
    public void mY(String Y){
        System.out.println("string Y: "+Y);
    }

    public static void main(String[]args){
        A a=new A();
        a.mY("Hello");
        System.out.print(a.mX(X.KX));
    }
}

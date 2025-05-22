public class Multiply {
    public int a, b;
    Multiply(int c){
        a=b=c;
    }
    Multiply(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getMultiple(){
        return (a*b);
    }

    public static void main(String[]args){
        Multiply M=new Multiply(2);
        Multiply M1=new Multiply(6,2);

        System.out.println("Multiple: "+M.getMultiple());
        System.out.println("Multiple: "+M1.getMultiple());

    }
}

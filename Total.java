public class Total {
    public int a, b;
    Total(int c){
       this.a=b=c;
    }
    Total(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getTotal(){
        return (a+b);
    }

    public static void main(String[]args){
        Total T=new Total(2, 3);
        Total T1=new Total(2,4);

        System.out.println("Total: "+T.getTotal());
        System.out.println("Total: "+T1.getTotal());

    }
}

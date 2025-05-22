public class Area {
    public int width;
    public int length;

    Area(int side){
        this.width=length=side;
    }

    Area(int width, int length){
        this.width=width;
        this.length=length;
    }

    public int getArea(){
        return length*width;
    }

    public static void main(String[]args){
        Area A=new Area(2);
        Area A1=new Area(2,3);

        System.out.println(A.getArea());
        System.out.println(A1.getArea());
    }
}

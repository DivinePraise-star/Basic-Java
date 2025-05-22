public class Shape {
    public int length;
    public int width;

    Shape(int side){
        this.width=length=side;
    }

    Shape(int w, int l){
        this.width=w;
        this.length=l;
    }

    public int getArea(){
        return (length*width);
    }

    public static void main(String[]args){
        Shape Square=new Shape(2);
        Shape Rectangle=new Shape(2,5);

        System.out.println("The area of the square is "+Square.getArea()+" units.");
        System.out.println("The area of the rectangle is "+Rectangle.getArea()+" units.");

    }
}

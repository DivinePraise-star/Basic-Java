public class Matrix {
    public static void main(String[]args){
        int[][]matrix={{4,6},{1,5}};
        int a=matrix[0][0];
        int b=matrix[0][1];
        int c=matrix[1][0];
        int d=matrix[1][1];
        int determinant=(a*d)-(c*b);

        //System.out.println("Matrix: "+(matrix));
        System.out.println("Determinant: "+determinant);
        if(determinant==0){
            System.out.println("The matrix has no inverse.");
        }else
            System.out.println("Matrix has an inverse.");

        int[][]transpose=new int[2][2];
        transpose[0][0]=matrix[0][0];
        transpose[0][1]=matrix[1][0];
        transpose[1][0]=matrix[0][1];
        transpose[1][1]=matrix[1][1];

        int e=transpose[0][0];
        int f=transpose[0][1];
        int g=transpose[1][0];
        int h=transpose[1][1];
             //int[][]Transpose={{e,f},{g,h}};
            // System.out.println(Transpose);

        int[][]inverse=new int[2][2];
        int invDet=(1/determinant);
        inverse[0][0]=invDet*e;
        inverse[0][1]=invDet*f;
        inverse[1][0]=invDet*g;
        inverse[1][1]=invDet*h;



    }
}

import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int Sum=0;
        int[]height=new int[6];
        for(int i=0;i<6;i++){
            System.out.print("Height"+(i+1)+": ");
            height[i]=input.nextInt();

            Sum+=height[i];
        }
        int Average=(Sum/ height.length);
        System.out.println("The average height is "+Average);
    }
}

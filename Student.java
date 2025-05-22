public class Student {
    public void getName(String Name){
        System.out.println("Name: "+Name);
    }
}
class Student1 extends Student{
    @Override
    public void getName(String Name){
        System.out.println("Name: "+Name);
    }
}
class Tested{
    public static void main(String[]args){
        Student1 S=new Student1();
        S.getName("Peter");
    }
}

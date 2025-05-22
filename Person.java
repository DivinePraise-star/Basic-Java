public class Person {
    public void getName(){
        System.out.println("Every person has a name");
    }
}
class Person1 extends Person{
    @Override
    public void getName(){
        System.out.println("Person1`s name is Rice");
    }
}
class Testing{
    public static void main(String[]args){
        Person1 P=new Person1();
        P.getName();
    }
}


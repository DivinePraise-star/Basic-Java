public class Dog implements Animal{
    @Override
    public void getSound(String Sound){
        System.out.println("The dog makes a "+Sound+" sound");
    }
    @Override
    public void getWalk(){
        System.out.println("Dogs run");
    }
}

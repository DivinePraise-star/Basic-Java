public class Cat implements Animal{
    @Override
    public void getSound(String Sound){
        System.out.println("The cat makes a "+Sound+" sound");
    }
    @Override
    public void getWalk(){
        System.out.println("Cats catwalk!");
    }
}


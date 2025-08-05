public class cat extends Animal{
    public cat(String name) {
        super(name);
    }
    public cat(){}

    public void jump(){
        System.out.println(getName()+" Jumping");
    }

    public void makeNoise(){
        System.out.println(getName()+" meau meau");
    }

}

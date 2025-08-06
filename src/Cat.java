public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {

    }

    public Cat(){}

    public void jump(){
        System.out.println(getName()+" Jumping");
    }

    public void makeNoise(){
        System.out.println(getName()+" meau meau");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" Sleeping");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" Roaming");
    }


}

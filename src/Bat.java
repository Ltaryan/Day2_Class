public class Bat extends Animal{

    @Override
    public void eat() {
        System.out.println(getName()+"Eating");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+"Make noise");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+"bird is eating");
    }

    @Override
    public void roam() {
        System.out.println(getName()+"bird is roaming");
    }

    public Bat() {
    }

    public Bat(String name) {
        super(name);
    }
}

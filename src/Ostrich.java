public class Ostrich extends Bird{

    public Ostrich() {
    }

    public Ostrich(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"eating");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+"Making Noise");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+"Sleeping");
    }

    @Override
    public void roam() {
        System.out.println(getName()+"Roaming");
    }
}

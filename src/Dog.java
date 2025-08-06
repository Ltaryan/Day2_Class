public class Dog extends Animal{
    public Dog(){}

    public Dog(String name){
        super(name);
    }

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

    public void play() {
        System.out.println(getName()+" Playing");
    }


}

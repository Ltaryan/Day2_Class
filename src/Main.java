//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        Address obj3=new Address(" Mumbai "," Maha ",400021);
//        Address obj4=new Address(" Bokaro ","J harkhand ",827013);
//
//        Employee employee=new Employee(" Aryan ",22,obj3,279980,"GET ",62000);
//        Student student=new Student(" Akshat ",17,obj4,5,"90");
//
//        employee.displayInfo();
//        employee.applyForleave();
//        student.displayInfo();

//        int sum=0;
//        for (String arg : args) {
//            sum+= Integer.parseInt(arg);
//        }
////        System.out.println("sum: "+sum);
//        Animal animal=new Animal("name....");
//
//        animal.makeNoise();
//
//        cat an = new cat();
//        an.makeNoise();
//
//        Animal a= new cat();
//        a.makeNoise();
//
//        cat c = (cat)a;
//        c.jump();
        Dog d = new Dog("Tisson");
        Cat c =new Cat("Sweetuu");
        Bat b=new Bat("Bat");
        Fish f=new Fish("fishi");
        Parrot p=new Parrot("totta");
        Ostrich o=new Ostrich("Cilly");

        AnimalUtils animalutils=new AnimalUtils();
         animalutils.addanimal(d);
         animalutils.addanimal(c);

        Animal[] animals = { d, c, b, f, o, p };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            animal.eat();
            animal.sleep();
            System.out.println();
        }






        }

    }

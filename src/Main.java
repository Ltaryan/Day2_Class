//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Address obj3=new Address(" Mumbai "," Maha ",400021);
        Address obj4=new Address(" Bokaro ","J harkhand ",827013);

        Employee employee=new Employee(" Aryan ",22,obj3,279980,"GET ",62000);
        Student student=new Student(" Akshat ",17,obj4,5,"90");

        employee.displayInfo();
        employee.applyForleave();
        student.displayInfo();



        }
    }

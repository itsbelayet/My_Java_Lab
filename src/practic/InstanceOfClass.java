package practic;

public class InstanceOfClass{
    public static void main(String[] args) {

        Animal an=new Animal();
        Person pr=new Person();
        Student st=new Student();

        System.out.println(an instanceof Animal);
        System.out.println(pr instanceof Person);
        System.out.println(st instanceof Student);
        System.out.println(an instanceof Student);
        System.out.println(st instanceof Animal);

    }
}
class Animal{

}
class Person extends Animal{

}
class Student extends Person{

}


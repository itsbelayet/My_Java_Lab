package practic;

public class Encapsul {
    private String name;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsul obj=new Encapsul();
        obj.setName("Miru");
        System.out.println(obj.getName());
        obj.setAge(57);
        System.out.println(obj.age);
        obj.setSalary(5000);
        System.out.println(obj.getSalary());


    }
}

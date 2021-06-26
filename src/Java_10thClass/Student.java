package Java_10thClass;

public class Student {
    int id,age;
    private String fname,lname,score;

    public Student(){

    }
    public Student(int id,int age,String fname,String lname,String score){
        this.id=id;
        this.age=age;
        this.fname=fname;
        this.lname=lname;
        this.score=score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setlName(String lname) {
        this.lname = lname;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

//    @Override
//    public String toString(){
//        return "Student"+"("+"id= "+id+")"+fname+" "+lname+" "+" Grade = "+score;
//    }
}

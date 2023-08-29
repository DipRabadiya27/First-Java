package OOPs;

public class O1 {
    public static void main(String[] args) {
        Stdu s1 = new Stdu();
        s1.name="Dip";
        s1.age=22;
        s1.rNo=15;
        System.out.println(s1.name + " " + s1.age + " " + s1.rNo);

        Student s2 = new Student("parth",17,20);
        System.out.println(s2.getname() + " " + s2.getage() + " " + s2.getrNo());
    }
}

class Stdu{
    String name;
    int age;
    int rNo;
}

class Student{
    private String name;
    private int age;
    private int rNo;
    Student(){}
    public Student(String name,int age,int rNo){
        this.name=name;
        this.age=age;
        this.rNo=rNo;
    }
    

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public int getrNo(){
        return rNo;
    }
}
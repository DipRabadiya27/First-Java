public class inheritance1 {
    public static void main(String[] args) {
        Student s1=new Student(1,80,7,"Dip",22);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(){
        this.name=name;
    }

    public void setAge(){
        this.age=age;
    }
}

class Student extends Person {
    private int rNo;
    private double perc;
    private int sem;

    public Student(int rNO,double perc,int sem,String name,int age){
        super(name,age);
        this.rNo=rNo;
        this.perc=perc;
        this.sem=sem;
        
    }
}
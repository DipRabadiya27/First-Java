public class inheritance1 {
    public static void main(String[] args) {
        Student s1=new Student(1,80,7,"Dip",22);
        System.out.println(s1.getName());
        
        Prof p1=new Prof("Maths", 217,"Abc", 40);
        System.out.println(p1.getName());
        System.out.println(p1.getSub());

        Emp e1=new Emp(15000, "IT", "PPS", 001, "XYZ", 22);
        System.out.println(e1.getSub());
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

    // public void setName(){
    //     this.name=name;
    // }

    // public void setAge(){
    //     this.age=age;
    // }
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

class Prof extends Person{
    private String sub;
    private int  id;

    public Prof(String sub,int id,String name,int age){
        super(name,age);
        this.sub=sub;
        this.id=id;
    }

    // public void setSub(){
    //     this.sub=sub;
    // }

    // public void setId(){
    //     this.id=id;
    // }

    public String getSub() {
        return sub;
    }
}

class Emp extends Prof{
    private int salary;
    private String dep;

    public Emp(int salary,String dep,String sub, int id, String name, int age) {
        super(sub, id, name, age);
        this.salary=salary;
        this.dep=dep;
    }

    public String getDep(){
        return dep;
    }
    public int getSalary(){
        return salary;
    }
}
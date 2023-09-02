public class inheritance1 {
    public static void main(String[] args) {
        Student s1=new Student(1,80,7,"Dip",22);
        System.out.println(s1.getNumber() + " " + s1.getPerc()+ " " + s1.getSem()+ " " + s1.getName()+ " " + s1.getAge());
        
        Prof p1=new Prof("Maths", 217,"Abc", 40);
        System.out.println(p1.getSub()+ " " + p1.getId()+ " " + p1.getAge()+ " "+ p1.getName());

        Emp e1=new Emp(15000, "IT", "PPS", 001, "XYZ", 22);
        System.out.println(e1.getSalary()+ " " + e1.getDep()+ " " +e1.getSub()+ " " + e1.getId()+ " " + e1.getAge()+ " "+ e1.getName());
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
    private int number;
    private double perc;
    private int sem;

    public Student(int number,double perc,int sem,String name,int age){
        super(name,age);
        this.number=number;
        this.perc=perc;
        this.sem=sem;
    }
    public int getNumber() {
        return number;
    }


    public double getPerc() {
        return perc;
    }

    public int getSem() {
        return sem;
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

    public int getId() {
        return id;
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
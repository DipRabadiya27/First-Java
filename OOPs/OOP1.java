package OOPs;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.print(this.color);
    }
}

class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }

    public void printInfo() {
        System.out.print(this.name);
        System.out.println(this.age);
    }
    Student(){}

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }

}

public class oop1 {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();
        System.out.println();

        Student s1 = new Student("Dip",22);
        Student s2 = new Student(s1);
        //s1.printInfo();
        s1.printInfo(s1.name,s1.age);
        s2.printInfo(s1.name,s1.age);
    }
}
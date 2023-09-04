import java.util.*;
// import bank.*;
public class oop1 {
    // public void area(){
    //     System.out.println("Display area");
    // }
    /**
     * 
     */
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();
        Triangle t1 = new Triangle();
        t1.area(2,2);
        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area(2,2);
        Circle c1 = new Circle();
        c1.area(2);
        // oop1 o1 = new oop1();
        // o1.area();
        // bank.Account Account1 = new bank.Account();
        // Account1.name = "Customer1";
    }
}

class Shape {
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println((l*h)/2);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l,int h){
        System.out.println((l*h)/2);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
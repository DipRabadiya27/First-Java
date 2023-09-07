public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.walk();
        // Chicken chicken = new Chicken();
        // chicken.walk();
        // horse.eat();

    }
}

abstract class Animal {
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    
}

class Horse extends Animal{
    Horse() {
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
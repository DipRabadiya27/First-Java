interface Animal {
    int eyes = 2;
    public void walk();
}

interface Herbivore extends Animal {
    
}

class Horse implements Animal,Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
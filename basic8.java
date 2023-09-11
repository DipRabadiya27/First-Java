public class basic8{
    public static void main(String[] args) {
        Bycycle bycycle = new Bycycle();
        Bike bike = new Bike();
        Car car = new Car();
        bycycle.changeGear(1);
        bike.changeGear(7);
        car.changeGear(6);
    }
}

interface Vehicle {
    void changeGear(int gear);
}

class Bycycle implements Vehicle{
    final static int Max_gear=2;
    public void changeGear(int gear){
        if(gear <1 || gear>Max_gear){
            System.out.println("Bycycle Invalid gear");
        } else {
            System.out.println("Bycycle Change gear" + gear);
        }
    }
}

class Bike implements Vehicle{
    final static int Max_gear=5;
    public void changeGear(int gear){
        if(gear <1 || gear>Max_gear){
            System.out.println("Bike Invalid gear");
        } else {
            System.out.println("Bike Change gear" + gear);
        }
    }
}

class Car implements Vehicle{
    final static int Max_gear=7;
    public void changeGear(int gear){
        if(gear <1 || gear>Max_gear){
            System.out.println("Car Invalid gear");
        } else {
            System.out.println("Car Change gear" + gear);
        }
    }
}
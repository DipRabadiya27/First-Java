

import java.util.Scanner;

public class basic10 {

	public static void main(String[] args) {		
		basic10.FirstChoice();
	}
	
	public static void FirstChoice() {
		System.out.println("SELECT VEHICLE");
		System.out.println("1.CAR");
		System.out.println("2.BICYCLE");
		System.out.println("3.BIKE");
		System.out.println("4.EXIT");
		System.out.println("Choice ::");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			Vehicle1 c = new Car1();
			c.start();
			basic10.SecondChoice(c);
			break;
		case 2:
			Vehicle1 b = new Bicycle1();
			b.start();
			basic10.SecondChoice(b);
			break;
		case 3:
			Vehicle1 a = new Bike1();
			a.start();
			basic10.SecondChoice(a);
			break;
		case 4:
			System.out.println("Thank you for visiting");
			System.exit(0);
			break;
		default:
			System.err.println("Enter a valid option");
			break;
		}
		basic10.FirstChoice();
	}
	
	public static void SecondChoice(Vehicle1 obj) {
		System.out.println("1.Speed Up");
		System.out.println("2.Change gear");
		System.out.println("3.Apply Brakes");
		System.out.println("4.Display Vehicle Status");
		System.out.println("5.change Vehicle");
		System.out.println("6.Exit");
		System.out.println("Choice ::");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			obj.inceraseSpeed();
			break;
		case 2:
			System.out.println("Enter a gear : ");
			int gear = sc.nextInt();
			obj.changeGear(gear);
			break;
		case 3:
			System.out.println("1.DECREASE SPEED");
			System.out.println("2.STOP BICYCLE");
			System.out.println("Choice ::");
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				obj.decreaseSpeed();
				break;
			case 2:
				obj.stop();
				break;
			default:
				break;
			}
			break;
		case 4:
			obj.vehicalStatus();
			break;
		case 5:
			basic10.FirstChoice();
			break;
		case 6:
			System.out.println("Thank you for visiting");
			System.exit(0);
		default:
			System.err.println("Enter a valid choice");
			break;
		}
		basic10.SecondChoice(obj);
	}

}

interface Vehicle1 {
	void start();
	void inceraseSpeed();
	void vehicalStatus();
	void changeGear(int gear);
	void decreaseSpeed();
	void stop();
}

class Bicycle1 implements Vehicle1{
	int speed = 0;
	int gear = 0;
	
	public void start() {
		System.out.println("Bycycle started successfully");
	}
	
	public void inceraseSpeed() {
		this.speed = this.speed + 5;
		System.out.println("Bycycle speed is increased");
		System.out.println("current speed is :"+this.speed);
	}
	
	public void vehicalStatus() {
		System.out.println("YOUR  Bycycle's SPEED IS "+this.speed +" Kmhr AND GEAR IS "+this.gear);
	}
	
	public void changeGear(int gear) {
		this.gear = gear;
		System.out.println("Gear changed Successfully");
		System.out.println("Current Gear Is "+this.gear);
	}
	
	public void decreaseSpeed() {
		this.speed = this.speed - 5;
		System.out.println("Bycycle Speed Reduced Successfull");
		System.out.println("current speed is :"+this.speed);
	}
	
	public void stop() {
		System.out.println("Bycycle stopped Successfully");
		this.gear = 0;
		this.speed = 0;
	}
}


class Bike1 implements Vehicle1{
	int speed = 0;
	int gear = 0;
	
	public void start() {
		System.out.println("Bike started successfully");
	}
	
	public void inceraseSpeed() {
		this.speed = this.speed + 5;
		System.out.println("Bike speed is increased");
		System.out.println("current speed is :"+this.speed);
	}
	
	public void vehicalStatus() {
		System.out.println("YOUR  Bike's SPEED IS "+this.speed +" Kmhr AND GEAR IS "+this.gear);
	}
	
	public void changeGear(int gear) {
		this.gear = gear;
		System.out.println("Gear changed Successfully");
		System.out.println("Current Gear Is "+this.gear);
	}
	
	public void decreaseSpeed() {
		this.speed = this.speed - 5;
		System.out.println("Bike Speed Reduced Successfull");
		System.out.println("current speed is :"+this.speed);
	}
	
	public void stop() {
		System.out.println("Bike stopped Successfully");
		this.gear = 0;
		this.speed = 0;
	}
}

class Car1 implements Vehicle1{
	int speed = 0;
	int gear = 0;
	
	public void start() {
		System.out.println("Car started successfully");
	}
	
	public void inceraseSpeed() {
		this.speed = this.speed + 5;
		System.out.println("Car speed is increased");
		System.out.println("current speed is :"+this.speed);
	}
	
	public void vehicalStatus() {
		System.out.println("YOUR  Car's SPEED IS "+this.speed +" Kmhr AND GEAR IS "+this.gear);
	}
	
	public void changeGear(int gear) {
		this.gear = gear;
		System.out.println("Gear changed Successfully");
		System.out.println("Current Gear Is "+this.gear);
	}
	
	public void decreaseSpeed() {
		this.speed = this.speed - 5;
		System.out.println("Car Speed Reduced Successfull");
		System.out.println("current speed is :"+this.speed);
	}
	
	public void stop() {
		System.out.println("Car stopped Successfully");
		this.gear = 0;
		this.speed = 0;
	}
	
}
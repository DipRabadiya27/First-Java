public class basic11 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bull Dog","Black");
        System.out.println(d1.getName() + d1.getColor());
        d1.setName("Max");
        d1.setColor("white");
        System.out.println(d1.getName() +" " + d1.getColor());
    }

}

class Dog{
    String name;
    String color;

    public Dog(String name, String color) {
        this.name=name;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setColor(String color) {
        this.color=color;
    }

}
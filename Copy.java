public class Copy {
    public static void main(String[] args) {
        Hello h1 = new Hello("Dip",22);
        System.out.print(h1.getName());
        Hello h2=new Hello(h1);
        System.out.println(h2.getName());
    }
}

class Hello{
    String name;
    int age;

    Hello(String name,int age){
        this.name=name;
        this.age=age;
    }

    Hello(Hello h2) {
        this.name=h2.name;
        this.age=h2.age;
    }

    public String getName() {
        return name;
    }
}

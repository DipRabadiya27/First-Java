public class practis {
    public static void main(String[] args) {
        dip b=new dip();
    }
}
class dip{
    dip(){
        System.out.println("perent");
    }
    dip(int a){
        this();
        System.out.println("hello");
    }
    
}
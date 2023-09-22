package String;

 
public class s2 {
    public static void main(String[] args){
        //compare
        String name1 = "Dip";
        String name2 = "Dip";

        //1 s1 > s2 : +ve value
        //1 s1 = s2 : 0
        //1 s1 < s2 : -ve value
        /*if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }*/

        if(name1==name2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }
    }
}
package String;
import java.util.*;
 
public class s1 {
    public static void main(Strings[] args){
        //concatenation
        String n="name";
        String m="nane";

        String n1=new String("Name");

        Scanner sc=new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();

        //String firstName = "Dip";
        //String lastName = "Rabadiya";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}

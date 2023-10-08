package String;

public class vowels {
    public static void main(String[] args) {
        String s = "DipRabadiya";
        String s1 = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U'){
                s1 = s1 + c;
            }
        }
        System.out.println(s1);
    }
}
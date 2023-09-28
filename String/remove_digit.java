package String;

public class remove_digit {
    public static void main(Strings[] args) {
        Strings s = "DipRabadiya2711";
        Strings ans = "";

        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){ 
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
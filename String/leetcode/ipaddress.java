package String.leetcode;

public class ipaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String s= "";
        for(int i=0;i<address.length();i++){
          if(address.charAt(i)=='.'){
            s += "[.]";
          }else{
            s += String.valueOf(address.charAt(i));
          }
        }
        System.out.println(s);
    }
}
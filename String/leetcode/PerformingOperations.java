package String.leetcode;

public class PerformingOperations {
    public static void main(String[] args) {
        String[] name = {"--x","--x","x++"};
        int s=0;
        for(String i : name){
            if(i.charAt(1) == '+'){
                s+=1;
            } else {
                s-=1;
            }
        }
        System.out.println(s);
    }
}
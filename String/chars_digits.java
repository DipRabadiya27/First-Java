package String;

public class chars_digits {
    public static void main(String[] args) {
        String s = "Dip123";
        char[] s1 = s.toCharArray();

        int num=0;
        int chars=0;
        int i=0;
        while (i<s.length()){
            if(s1[i] >= '0' && s1[i] <= '9'){
                num++;
                i++;
            }else {
                chars++;
                i++;
            }
        }

        if (num==chars){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
package String;

public class mergeString {
    public static void main(Strings[] args) {
        String s = "Dpaaia";
        String s1 = "iRbdy";
        String s2 = "";

        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();
        int n = s.length();
        int n1 = s1.length();

        char i=0;
        char j=0;

        while (i<=n && j<n1){
            s2 += c[i];
            s2 += c1[j];
            i++;
            j++;
        }
        System.out.print(s2);
    }
}
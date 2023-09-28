package String;

public class frequency {
    public static void main(Strings[] args) {
        String s = "Dip Rabadiya";
        // s=s.trim();
        int[] arr = new int[s.length()];
        char c[] = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            arr[i] = 1;
            for (int j=i+1; j<s.length(); j++){
                if(c[i] == c[j]){
                    arr[i]++;
                    c[j] = 'O';
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(c[i] != ' ' && c[i] != 'O'){
                System.out.println(c[i] + "-" + arr[i]);
            }
        }
    }
}
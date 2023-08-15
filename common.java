
public class common {
    public static void main(String[] args) {
        int[] A1 = {2,5,8,9,0,10,12};
        int[] A2 = {1,2,3,6,8,11,10,2,0};
        for (int i = 0; i <A1.length; i++){
            for(int j=0; j<A2.length; j++){
                if(A1[i]==A2[j]){
                    System.out.println(A1[i]);
                    break;
                }
            }
        }
    }
}
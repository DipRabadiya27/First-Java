import java.util.Arrays;

public class J32 {
    public static void main(String args[]){
        int A1[] = {2,3,5,6,8,9};
        int A2[] = {1,2,3,8,9,10};
        int n=A1.length, m=A2.length;
        int A3[]=new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(A1[i]<A2[j]){
                A3[k]=A1[i];
                i++;
            }
            else {
                A3[k]=A2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            A3[k]=A1[i];
            i++;
            k++;
        }   
        while(j<m){
        A3[k]=A2[j];
        j++;
        k++;
        }
        System.out.println(Arrays.toString(A3));
    }
}

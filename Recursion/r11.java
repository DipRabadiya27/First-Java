package Recursion;
import java.util.ArrayList;
//print all subsequnces  
public class r11 {

    static void subsequnces(int ind,ArrayList<Integer> ds,int[] arr,int n) {
        if(ind==n){
            for(int i=0;i<ds.size();i++){
                System.out.print(ds);
            }
            System.out.println();
            return;
            
        }

        //take or pick the particular index into the subsequence
        ds.add(arr[ind]);
        subsequnces(ind+1,ds,arr,n);
        ds.remove(ds.size()-1);
        // ds.remove(arr[ind]);
        //not pick or not take condition, this element is not added to your subsequence
        subsequnces(ind+1,ds,arr,n);
        
    }
    public static void main(String[] args) {
        int[] arr ={3,1,2};
        ArrayList<Integer> ds=new ArrayList<Integer>();
        int n=3;
        subsequnces(0,ds,arr,n);
    } 
}
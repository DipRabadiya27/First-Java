public class J22 {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {1,3,5,7,6,5,9,2};
        int n=arr1.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}

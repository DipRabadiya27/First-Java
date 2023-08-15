public class J17 {
    public static void main(String[] args){
        int[] arr = new int[5];
        int p = 0;
        p=insert(arr,p,10);
        p=insert(arr,p,20);
        p=insert(arr,p,30);
        p=insert(arr,p,40);
        p=insert(arr,p,50);
        print(arr,p);
        System.out.println();
        Object a;
        update(arr,p,20,60);
        System.out.print("Update array:");
        print(arr,p);
        p=delete(arr,p,60);
        print(arr,p);
    }

    private static int delete(int[] arr,  int p, int value){
        for(int i=0; i<p; i++){
            if(arr[i] == value){
                for(int j=i; j<p-1; j++){
                    arr[j]=arr[j+1];
                }
                p--;
            }
        }
        return p;
    }

    private static void update(int[] arr, int p, int oldV, int newV){
        for (int i=0; i<p; i++){
            if (arr[i]==oldV){
                arr[i] = newV;
            }
        }
    }

    private static void print(int[] arr, int p) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static int insert(int[] arr, int p, int v) {
        if(p==arr.length){
            System.out.println("array is full");
            return p;
        }
        arr[p]=v;
        p++;
        return p;
    }
    
}

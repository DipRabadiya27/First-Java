public class J35 {
    public static void main(String[] args){
        int[] arr = new int[5];
        int p = 0;
        p=insert(arr,p,10);
        p=insert(arr,p,5);
        p=insert(arr,p,4);
        p=insert(arr,p,14);
        p=insert(arr,p,50);
        print(arr,p);
        p=delete(arr,p,4);
        System.out.println();
        print(arr,p);
        update(arr,p,5,20);
        System.out.println();
        print(arr,p);
        find(arr, p, 70);
}

    private static void find(int[] arr, int p, int i) {
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == i){
                System.out.println("value is present");
                return;
            }
            else if(i > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        System.out.println("value not present");
    }

    private static void update(int[] arr, int p, int oldV, int newV){
        p=delete(arr,p,oldV);
        p=insert(arr,p,newV);

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
        if(p==0){
            arr[p]=v;
            p++;
        } else {
            if(v > arr[p-1]){
                arr[p]=v;
                p++;
                return p;
            } else {
                for(int i=p-1;i>=0;i--){
                    if(v<arr[i]){
                        arr[i+1]=arr[i];
                        arr[i]=v;
                    }
                }
                p++;
            }
        }
        return p;
    }
}

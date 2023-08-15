public class function {
    public static void main(String[] args){
        int[] arr = new int[10];
        int p = 0;
        System.out.println("isEmpty: " + isEmpty(p));
        p = insert(arr, p,10);
        p = insert(arr, p,20);
        p = insert(arr, p,30);
        p = insert(arr, p,40);
        p = insert(arr, p,50);
        p = insert(arr, p,60);
        p = insert(arr, p,70);
        p = insert(arr, p,80);
        p = insert(arr, p,90);
        p = insert(arr, p,100);
        print(arr,p);

        find(arr, p, 70);

        update(arr, p, 20, 300);
        update(arr, p, 40, 500);
        update(arr, p, 60, 700);
        update(arr, p, 80, 900);
        update(arr, p, 100, 1100);
        System.out.print("Update array: ");
        print(arr,p);

        System.out.print("Before delete: ");
        print(arr,p);
        p = delete(arr, p, 300);
        p = delete(arr, p, 500);
        p = delete(arr, p, 700);
        p = delete(arr, p, 900);
        p = delete(arr, p, 1100);
        System.out.print("after delete: ");
        print(arr,p);

        System.out.println("size is:" + size(p));
        System.out.println("isEmpty:" + isEmpty(p));

    }

    private static int size(int p) {
        return p;
    }

    private static boolean isEmpty(int p) {
        if(p==0){
            return true;
        }
        return false;
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

    private static void find(int[] arr, int p, int value){
        for(int i=0; i<p; i++){
            if(arr[i] == value){
                System.out.println(value + " value is present");
                return;
            }
        }
        System.out.println("value is not present");
    }

    private static void print(int[] arr, int p){
        for(int i=0; i<p; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int insert(int[] arr, int p, int value){
        if(p==arr.length){
            System.out.print("arr is full");
            return p;
        }
        arr[p] = value;
        p++;
        return p;
    }
}

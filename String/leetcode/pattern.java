package String.leetcode;

public class pattern {
    public static void main(String[] args) {
        int a=5;
        int x=1;
        for(int i=0;i<a;i++){
            int y=x;
            for(int j=0;j<a;j++){
                if(j<=i){
                    if(i%2==0){
                        System.out.print(y +" ");
                        y++;
                    }else{
                        System.out.print(y +" ");
                        y--;
                    }
                }
            }
            System.out.println();
            x+=2;
        }
    }
}
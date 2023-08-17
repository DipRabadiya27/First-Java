public class mat5{
    public static void main(String args[]){
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int row=mat.length;
        int col=mat[0].length;
        for(int r=row-1;r>=0;r--){
            for(int c=col-1;c>=0;c--){
                System.out.print(mat[r][c]+ " ");
            }
            System.out.println();
        }
        // System.out.println();
    }
}
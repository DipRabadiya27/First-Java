public class mat14 {
    public static void main(String args[]){
        int[][] mat={{1,2,3,},{4,5,6},{7,8,9}};
        int row=mat.length;
        
        for(int r=0;r<row;r++){
            System.out.print(mat[r][row-1-r]);
        }
        System.out.println();
    } 
}

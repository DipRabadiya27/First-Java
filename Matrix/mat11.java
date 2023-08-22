public class mat11 {
    public static void main(String args[]) {
        int mat[][] = { { 1, 20, 3, 4 }, { 5, 6, 70, 8}, { 90, 10, 11, 12 } };
        int row = mat.length;
        int col = mat[0].length;
        
        for (int r = 0; r < row; r++) {
        int maxIndex=0;
            for (int c = 1; c < col; c++) {
                if(mat[r][c]>mat[r][maxIndex]){
                    maxIndex=c;  
                }
            }
            for(int i=maxIndex;i<col-1;i++){
                mat[r][i]=mat[r][i+1];
            }
        }
        col--;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++){
                
                System.out.print(mat[r][c]);
            }
        
        System.out.println();
    }
    }
}
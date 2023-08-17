public class mat12 {
    public static void main(String args[]) {
        int mat[][] = { { 1, 20, 3, 40 }, { 50, 6, 7, 8}, { 9, 10, 11, 12 } };
        int row = mat.length;
        int col = mat[0].length;
        
        for (int r = 0; r < col; r++) {
        int max=0;
        int rr=0;
        int cc=0;
            for (int c = 0; c < row; c++) {
                if(max<mat[c][r]){
                    max=mat[c][r];  
                    rr=c;
                    cc=r;   
                }
            }
            mat[rr][cc]=0;
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++){
                if(mat[r][c]!=0){
                System.out.print(mat[r][c]);
                }
            }
                System.out.println();
        }
    }
}
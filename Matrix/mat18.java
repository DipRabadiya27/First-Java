public class mat18 {
    public static void main(String args[]){
        int[][] mat = {
            {1,2,3,4},
            {2,6,8,8},
            {4,5,2,8},
            {10,2,4,3}
        };
        int row=mat.length,col=mat[0].length;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(r==0 && c==0){
                    continue;
                } else if(r==0){
                    mat[r][c]=mat[r][c]+mat[r][c-1];
                } else if(c==0){
                    mat[r][c]=mat[r][c]+mat[r-1][c];
                } else {
                    mat[r][c]=mat[r][c]+Math.min(mat[r][c-1],mat[r-1][c]);
                }
            }
        }
        System.out.println(mat[row-1][col-1]);
    }
}
public class mat9 {
    public static void main(String args[]) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 88 }, { 9, 10, 11, 12 } };
        int row = mat.length;
        int col = mat[0].length;
        // int sum = 0;
        int max = 0;
        for (int r = 0; r < row; r++) {
            int sum=0;
            for (int c = 0; c < col; c++) {
                sum += mat[r][c];
                // if (max <sum){
                // max=sum;
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
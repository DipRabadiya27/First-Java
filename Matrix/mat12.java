public class mat12 {
    public static void main(String args[]) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int row = mat.length;
        int col = mat[0].length;

        for (int r = 0; r < col; r++) {
            int maxIndex = 0;
            for (int c = 0; c < row; c++) {
                if (mat[c][r] > mat[maxIndex][r]) {
                    maxIndex = c;
                }
            }
            for (int i = maxIndex; i < row - 1; i++) {
                mat[r][i] = mat[r][i+1];
            }
        }
        row--;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {

                System.out.print(mat[r][c]+" ");
            }

            System.out.println();
        }
    }
}
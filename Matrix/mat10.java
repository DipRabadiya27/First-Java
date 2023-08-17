public class mat10 {
    public static void main(String args[]) {
        int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int row = mat.length;
        int col = mat[0].length;
        int max = 0;
        for(int r=0;r<col;r++){
            int sum=0;
            for(int c=0;c<row;c++){
                sum += mat[c][r];
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
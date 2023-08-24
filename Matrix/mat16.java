public class mat16 {
    public static void main(String args[]) {
        int[][] mat = { { 1, 8, 12 },
                { 4, 10, 14 },
                { 7, 11, 15 } };

        int row = mat.length, col = mat[0].length;
        int r=0,c=col-1;
        int value = 4;
        while (r < row && c>=0) {
            if (value == mat[r][c]) {
                System.out.println("value is present");
                return;
            } else if (value < mat[r][c]) {
                c--;
            } else {
                r++;
            }
        }
        System.out.println("value not present");
    }
}
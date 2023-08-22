public class mat16 {
    public static void main(String args[]) {
        int[][] mat = { { 1, 8, 12 },
                { 4, 10, 14 },
                { 7, 11, 15 } };

        int row = 0, col = mat[0].length - 1;
        int value = 6;
        while (row <= col) {
            if (value == mat[row][col]) {
                System.out.println("value is present");
                return;
            } else if (value < mat[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("value not present");
    }
}

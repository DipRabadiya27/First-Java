public class mat17 {
    public static void main(String args[]) {
        int[][] mat = { { 1, 4, 7, 9 },
                { 10, 13, 16, 19 },
                { 22, 25, 26, 29 },
                { 35, 38, 40, 50 } };

        int value = 14;
        int row = mat.length, col = mat[0].length;
        int top = 0, bottom = row - 1;
        int rowTobesearched = -1;

        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (value >= mat[mid][0] && value <= mat[mid][col - 1]) {
                rowTobesearched = mid;
                break;
            } else if (value < mat[mid][0]) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }
        if (rowTobesearched == -1) {
            System.out.println("Value not present");
            return;
        }

        int left = 0, right = col - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (value == mat[rowTobesearched][mid]) {
                System.out.println("value is present");
                return;
            } else if (value < mat[rowTobesearched][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("value not present");

    }
}

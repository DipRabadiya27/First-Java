public class mat17 {
    public static void main(String args[]) {
        int[][] mat = { { 1, 4, 7, 9 },
                { 10, 13, 16, 19 },
                { 22, 25, 26, 29 },
                { 35, 38, 40, 50 } };

        int value = 40;
        int row = mat.length, col = mat[0].length;
        int top = 0, bottom = row - 1;
        int index = -1;

        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (value >= mat[mid][0] && value <= mat[mid][col - 1]) {
                index = mid;
                break;
            } else if (value < mat[mid][0]) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        }

        int left = 0;
        int right = col - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (value == mat[index][mid]) {
                System.out.println("value found");
                return;
            } else if (value < mat[index][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Not found");

    }
}

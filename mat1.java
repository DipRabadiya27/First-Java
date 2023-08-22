import java.util.Arrays;

class mat1 {
    public static void main(String[] args) {
        int[][] image = { { 1, 2, 4 }, { 3, 3, 1 } };

        int count = 0;
        int row = image.length;
        int col = image[0].length;
        for (int i = 0; i < image.length; i++) {
            Arrays.sort(image[i]);
        }
        for (int r = 0; r < col; r++) {
            int max = 0;
            for (int c = 0; c < row; c++) {
                if (max < image[c][r]) {
                    max = image[c][r];
                }
            }
            count += max;
        }
        System.out.println(count);
    }

}
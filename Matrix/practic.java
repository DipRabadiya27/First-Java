public class practic {

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 1 }, { 1, 1, 0 }, { 1, 1, 1 } };
        int N = mat.length;
        int M = mat[0].length;
        int val = returr(mat, M, N);
        System.out.println(val);

    }

    public static int returr(int[][] mat, int M, int N) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[j][i] == 1) {
                    return j;
                }
            }
            
        }
        return 0;
    }
}

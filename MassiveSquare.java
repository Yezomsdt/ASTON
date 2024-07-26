public class MassiveSquare {
    public static void main(String[] args) {
        int n = 5;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - 1 - i] = 1;
        }

        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

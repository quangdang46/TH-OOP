public class Ex2 {
    /*
     * • Write a function to add two matrices of the same size.
     * • Write a function to multiply a matrix with a number.
     * • Write a function to print a matrix to screen in matrix format.
     * • Write a main function and run all above functions.
     */
    // Write a function to add two matrices of the same size
    public static int[][] addMatrix(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    // Write a function to multiply a matrix with a number
    public static int[][] multiplyMatrix(int[][] a, int b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] * b;
            }
        }
        return c;
    }

    // Write a function to print a matrix to screen in matrix format.
    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Write a main function and run all above functions
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] c = addMatrix(a, b);
        int[][] d = multiplyMatrix(a, 2);
        printMatrix(c);
        System.out.println("___________");
        printMatrix(d);
    }
}

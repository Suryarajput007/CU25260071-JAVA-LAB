class Matrix {
    int[][] matrix = new int[2][2];

    static String matrixType = "2 x 2 Matrix";

    Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    void add(Matrix other) {
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] =
                        matrix[i][j] + other.matrix[i][j];
            }
        }

        System.out.println("Matrix Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void subtract(Matrix other) {
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] =
                        matrix[i][j] - other.matrix[i][j];
            }
        }

        System.out.println("Matrix Subtraction:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = {
            {10, 20},
            {30, 40}
        };

        int[][] b = {
            {1, 2},
            {3, 4}
        };

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        System.out.println("Matrix Type: " + matrixType);

        m1.add(m2);
        m1.subtract(m2);
    }
}
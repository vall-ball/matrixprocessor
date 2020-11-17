package processor;

public class MatrixWriter {

    public void print(double matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printVector(double vector[]) {
        for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + " ");
        }
    }
}

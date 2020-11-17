package processor;

import java.util.Scanner;

public class WorkProcess {
    MatrixReader reader = new MatrixReader();
    MatrixWriter writer = new MatrixWriter();
    MatrixProcessor processor = new MatrixProcessor();
    Scanner scanner = new Scanner(System.in);

    public void addMatrices() {
        double[][] firstMatrix = reader.read("first");
        double[][] secondMatrix = reader.read("second");
        double[][] result = processor.add(firstMatrix, secondMatrix);
        System.out.println("The add result is:");
        writer.print(result);
    }

    public void multiplyMatrixByConstant() {
        double[][] matrix = reader.read("");
        System.out.println("Please enter number");
        double number = scanner.nextDouble();
        double[][] result = processor.multiplyByNumber(matrix, number);
        System.out.println("The multiply result is:");
        writer.print(result);
    }

    public void multiplyMatrices() {
        double[][] firstMatrix = reader.read("first");
        double[][] secondMatrix = reader.read("second");
        double[][] result = processor.mult(firstMatrix, secondMatrix);
        System.out.println("The multiplication result is:");
        writer.print(result);
    }

    public void transposeMatrix() {
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        double[][] array = reader.read("");
        double[][] result = null;
        switch (choice) {
            case 1:
                result = processor.transposeByMainDiagonal(array);
                break;
            case 2:
                result = processor.transposeBySideDiagonal(array);
                break;
            case 3:
                result = processor.transposeByVerticalLine(array);
                break;
            case 4:
                result = processor.transposeByHorizontalLine(array);
                break;
        }
        System.out.println("The result is:");
        writer.print(result);
    }

    public void determinant() {
        double[][] matrix = reader.read("");
        double result = processor.determinantOfMatrix(matrix);
        System.out.println("The result is:");
        System.out.println(result);
    }

    public void invese() {
        double[][] matrix = reader.read("");
        double[][] result = processor.inverseMatrix(matrix);
        System.out.println("The result is:");
        writer.print(result);
    }

}

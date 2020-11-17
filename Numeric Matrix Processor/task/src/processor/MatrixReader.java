package processor;

import java.util.Scanner;

public class MatrixReader {
    public Scanner scanner = new Scanner(System.in);

    public double[][] read(String firstOrSecond) {
        System.out.println("Enter size of "+ firstOrSecond + " matrix: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        scanner.hasNextLine();
        double[][] answer = new double[row][column];
        System.out.println("Enter "+ firstOrSecond + " matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                answer[i][j] = scanner.nextDouble();
            }
        }
        return answer;
    }
}

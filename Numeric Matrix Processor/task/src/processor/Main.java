package processor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 10;
        while (choice !=0) {
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix by a constant");
            System.out.println("3. Multiply matrices");
            System.out.println("4. Transpose matrix");
            System.out.println("5. Calculate a determinant");
            System.out.println("6. Inverse matrix");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            WorkProcess process = new WorkProcess();
            switch (choice) {
                case 1:
                    process.addMatrices();
                    break;
                case 2:
                    process.multiplyMatrixByConstant();
                    break;
                case 3:
                    process.multiplyMatrices();
                    break;
                case 4:
                    process.transposeMatrix();
                    break;
                case 5:
                    process.determinant();
                    break;
                case 6:
                    process.invese();
                    break;
                case 0:
                    break;

            }
        }
    }
}


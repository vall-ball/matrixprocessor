package processor;

public class MatrixProcessor {
    ArrayUtils utils = new ArrayUtils();

    public double[][] add(double[][] firstMatrix, double[][] secondMatrix) {
        double[][] result = new double[firstMatrix.length][firstMatrix[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < firstMatrix[0].length; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return result;
    }

    public double[][] multiplyByNumber(double[][] matrix, double number) {
        double[][] result = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = number * matrix[i][j];
            }
        }
        return result;
    }

    public double[][] mult(double[][] firstMatrix, double[][] secondMatrix) {
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = scalarMultOfVectors(utils.findRow(firstMatrix, i), utils.findColumn(secondMatrix, j));
            }
        }
        return result;
    }

    public double scalarMultOfVectors(double[] firstVector, double[] secondVector) {
        double result = 0;
        for (int i = 0; i < firstVector.length; i++) {
            result += firstVector[i] * secondVector[i];
        }
        return result;
    }

    public double[][] transposeByMainDiagonal(double[][] array) {
        double[][] answer = new double[array.length][array[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = array[j][i];
            }
        }
        return answer;
    }

    public double[][] transposeBySideDiagonal(double[][] array) {
        double[][] answer = new double[array.length][array[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = array[array.length - j - 1][array[0].length - i - 1];
            }
        }
        return answer;
    }

    public double[][] transposeByVerticalLine(double[][] array) {
        double[][] answer = new double[array.length][array[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = array[i][array[0].length - j - 1];
            }
        }
        return answer;
    }

    public double[][] transposeByHorizontalLine(double[][] array) {
        double[][] answer = new double[array.length][array[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = array[array.length - i - 1][j];
            }
        }
        return answer;
    }

    public double determinantOfMatrix(double[][] array) {
        if (array.length == 1) {
            return array[0][0];
        } else if (array.length == 2) {
            return array[0][0] * array[1][1] - array[0][1] * array[1][0];
        } else {
            double answer = 0;
            for (int i = 0; i < array.length; i++) {
                answer += Math.pow(-1, i) * array[0][i] * determinantOfMatrix(utils.minorOfMatrix(array, 0, i));
            }
            return answer;
        }
    }

    public double[][] inverseMatrix(double[][] array) {
        return multiplyByNumber(transposeByMainDiagonal(cofactorsMatrix(array)), 1 / determinantOfMatrix(array));
    }

    public double[][] cofactorsMatrix(double[][] array) {
        double[][] answer = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j< array.length; j++) {
                answer[i][j] = Math.pow(-1, i + j) * determinantOfMatrix(utils.minorOfMatrix(array, i, j));
            }
        }
        return answer;
    }

}

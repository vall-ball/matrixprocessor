package processor;

public class ArrayUtils {

    public double[] findRow(double[][] array, int index) {
        double[] answer = new double[array[0].length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = array[index][i];
        }
        return answer;
    }

    public double[] findColumn(double[][] array, int index) {
        double[] answer = new double[array.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = array[i][index];
        }
        return answer;
    }

    public double[][] minorOfMatrix(double[][] array, int row, int column) {
        int rowOfAnswer = 0;
        int columnOfAnswer = 0;
        double[][] answer = new double[array.length - 1][array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i != row) {
                for (int j = 0; j < array.length; j++) {
                    if (j != column) {
                        answer[rowOfAnswer][columnOfAnswer] = array[i][j];
                        columnOfAnswer++;
                    }
                }
                rowOfAnswer++;
                columnOfAnswer = 0;
            }
        }
        return answer;
    }

}

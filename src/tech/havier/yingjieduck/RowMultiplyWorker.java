package tech.havier.yingjieduck;

public class RowMultiplyWorker implements Runnable {

    private final Matrix result;
    private Matrix matrix1;
    private Matrix matrix2;
    private final int row;

    public RowMultiplyWorker(Matrix result, Matrix matrix1, Matrix matrix2, int row) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.row = row;
    }

    @Override
    public void run() {
        for (int i = 0; i < matrix2.data[0].length; i++) {
            result.data[row][i] = 0;
            for (int j = 0; j < matrix1.data[row].length; j++) {
                result.data[row][i] += matrix1.data[row][j] * matrix2.data[j][i];

            }

        }

    }

}
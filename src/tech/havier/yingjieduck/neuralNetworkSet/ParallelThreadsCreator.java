package tech.havier.yingjieduck.neuralNetworkSet;

import java.util.ArrayList;
import java.util.List;

public class ParallelThreadsCreator {

    // creating 10 threads and waiting for them to complete then again repeat steps.
    public static void multiply(Matrix matrix1, Matrix matrix2, Matrix result) {
        List<Thread> threads = new ArrayList<>();
        int rows1 = matrix1.rows;
        for (int i = 0; i < rows1; i++) {
            RowMultiplyWorker task = new RowMultiplyWorker(result, matrix1, matrix2, i);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
            if (threads.size() % 10 == 0) {
                waitForThreads(threads);
            }
        }
    }

    private static void waitForThreads(List<Thread> threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        threads.clear();
    }
}
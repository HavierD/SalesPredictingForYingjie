package tech.havier.yingjieduck;

import tech.havier.yingjieduck.DataBase.DatabaseOperation;
import tech.havier.yingjieduck.DataElement.DataElement;
import tech.havier.yingjieduck.DataElement.DataElementArray;
import tech.havier.yingjieduck.neuralNetworkSet.NeuralNetwork;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Neuron networks code referenced from <a href="https://github.com/SuyashSonawane/JavaNet">...</a>,
 * includes tech.havier.yingjieduck.neuralNetworkSet.NeuralNetwork class, tech.havier.yingjieduck.neuralNetworkSet.Matrix class, tech.havier.yingjieduck.neuralNetworkSet.ParallelThreadsCreator class, tech.havier.yingjieduck.neuralNetworkSet.RowMultiplyWorker class
 * and workerThread class. Others are all written by me.
 */

public class Main {
    public static void main(String[] args) throws Exception {



        /**
         * The number of hidden neurons should be between the size of the input layer and the size of the output layer, or
         * The number of hidden neurons should be 2/3 the size of the input layer, plus the size of the output layer, or
         * The number of hidden neurons should be less than twice the size of the input layer.
         */
        NeuralNetwork nn = new NeuralNetwork(54, 15, 9);

        /**
         * train the model
         */

        DataElementArray dd = new DataElementArray();
        double[][] input = dd.allInputData();
        double[][] output = dd.allOutputData();
        nn.fit(input, output, 1000, 1);

//        nn.fit(Database.allInputData, Database.allOutputData, 70000, 1);

        /**
         * other training models
         */
//        nn.fit(inputDataSet,outputResults,10000,1); // logging set to 1, shows logs for each epoch
//        nn.fit(inputDataSet, outputResults, 400); // silent learn
//        nn.fit(inputDataSet,outputResults,500,0); // logging set to 0, shows training time and average error
        /**
         * Test the model
         */

        List<Double> output1;
        double[][] input1 = {
                new DataElementArray(new int[]{0, 9, 23, 0, 8, 28, 5, 0, 4, 1, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}).predictingData(),
                {0,0,0,1,0,0,0,1,1,0,1,0,0,0,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,1,0,1,1,0,1,1,1,0,1,0,0,0,1,1,1,0,0,0,0,0,0,1,0}, //26  =33
                {0,0,0,1,0,0,0,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,1,0,1,0,1,1,0,0,1,0,0,0,1,1,1,0,0,1,0,0,0,0,1},//27  =35
                {0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,1,1,0,1,0,0,0,1,1,0,1,1,0,1,0,0,0,0,1,1,1,0,0,1,0,1,0,0,1},//28  =32
                {0,0,0,1,0,0,0,1,1,1,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,0,1,0,1,0,0,1,0,1,0,1,0,1,1,1,0,0,0,1,0,0,0,0,1,0,1,1,1,1},//29  =16
                {0,0,0,1,0,0,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,0}, //30  =23
                {0,0,0,1,0,0,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,1,0,0,0,0,0,1,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1} //31/8  ==28

        };
//                DatabaseOperation.finalInputSetForTraining();

        int cIndex = 0;
        for (double[] d : input1) {
            int[] comparing = {0, 33, 35, 32, 16, 23, 28};


            output1 = nn.predict(d);
            List<Integer> output2 = new ArrayList<>();
            //round output from double into integer
            for(double e : output1){
                output2.add((int) Math.round(e));
            }

            String output3 = output2.toString().replaceAll(",", "").replaceAll(" ", "").replace("[", "").replace("]", "");
            int decimal = Integer.parseInt(output3, 2);
            System.out.println(decimal - comparing[cIndex]);
            cIndex++;
        }
    }
}

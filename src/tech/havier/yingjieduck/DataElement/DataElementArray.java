package tech.havier.yingjieduck.DataElement;

import java.util.Arrays;

import static tech.havier.yingjieduck.DataElement.DataElement.*;
import static tech.havier.yingjieduck.SqlOperation.getAllDataFromDB;

public class DataElementArray {

    private boolean predicting;
    private final DataElement[] dataBunch;
    public DataElementArray() throws Exception {
        int[][] allData = getAllDataFromDB();
        dataBunch = new DataElement[allData.length];
        for (int i = 0; i < dataBunch.length; i++) {
            dataBunch[i] = new DataElement(allData[i]);
        }
        predicting = false;
    }

    /**
     * for predicting
     */
    public DataElementArray(int[] predict){
        dataBunch = new DataElement[1];
        dataBunch[0] = new DataElement(predict);
        predicting = true;
    }

    /**
     * for predicting
     */
    public double[] predictingData(){
        if (!predicting) {
            throw new IllegalStateException("this instance is not for predicting!!!");
        }
        double[] returnedArray = new double[new DataElement().getTotalInputCount()];
        String binaryString = generateWholeBinaryCodeForInput(dataBunch[0].inputValueArray());
        returnedArray = changeBinaryStringIntoArray(binaryString);
        return returnedArray;
    }

    /**
     * provide all input binary data nested arrays from database for training.
     * @return
     */
    public double[][] allInputData(){
        double[][] returnedArrays = new double[dataBunch.length][new DataElement().getTotalInputCount()];
        for(int i = 0; i < dataBunch.length; i++){
            String binaryString = generateWholeBinaryCodeForInput(dataBunch[i].inputValueArray());
            returnedArrays[i] = changeBinaryStringIntoArray(binaryString);
        }
        return returnedArrays;
    }


    public double[][] allOutputData() {
        double[][] returnedArrays = new double[dataBunch.length][getTotalOutputCount()];
        for (int i = 0; i < dataBunch.length; i++) {
            String binaryString = generateWholeBinaryCodeForOutput(dataBunch[i].outputValue());
            returnedArrays[i] = changeBinaryStringIntoArray(binaryString);
        }
        return returnedArrays;
    }

    private String generateWholeBinaryCodeForOutput(int output){
        int di = new Result().getBITS_COUNT();
        String format = "%0" + di + "d";
        String rawBinaryValue = Integer.toBinaryString(output);
        return String.format(format, Integer.parseInt(rawBinaryValue));
    }

    /**
     * convert int[] into a String binary code
     * @param inputArray
     * @return
     */
    private String generateWholeBinaryCodeForInput(int[] inputArray){
        StringBuilder binaryCode = new StringBuilder();
        for(int i = 0; i< inputArray.length; i++){
            int di = new DataElement().getInputBitsCounts()[i];
            int decimalValue = inputArray[i];
            String format = "%0" + di + "d";
            String rawBinaryValue = Integer.toBinaryString(decimalValue);
            String binaryValue = String.format(format, Integer.parseInt(rawBinaryValue));
            binaryCode.append(binaryValue);
        }
        return binaryCode.toString();
    }

    private double[] changeBinaryStringIntoArray(String binaryString) {
        String[] charArray = binaryString.split("(?!^)");
        double[] doubleArray = new double[charArray.length];
        for (int i = 0; i < charArray.length; i++){
            doubleArray[i] = Double.parseDouble(charArray[i]);
        }
        return doubleArray;
    }

}

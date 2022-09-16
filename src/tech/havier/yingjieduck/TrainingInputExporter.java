package tech.havier.yingjieduck;

/**
 * generate 2-dimensional double array for training the neural network.
 */
public class TrainingInputExporter implements DataSet.Exporter {

    private int[][] decimalSet;
    private double[] trainingInputOneRow;
    private static final int[] format = DataSet.getFormat10to2();

    public static void main(String[] args) throws Exception {
        int[][] sql = SqlOperation.getAllDataFromDB();
        DataSet me = new DataSet(new SqlImporter(sql));

        DataSet.Exporter exporter = new TrainingInputExporter();
        me.exportTo(exporter);
//        exporter.
    }

    @Override
    public void saveDecimalSet(int[][] decimalSet) {
        this.decimalSet = decimalSet;
    }

    public static double[][] toDoubleNestedArrays(){
//        System.out.println(Arrays.toString(decimalSet[1]));
        return null;
    }


    public static String generateWholeBinaryCode(int[] inputArray){
        StringBuilder binaryCode = new StringBuilder();
        for(int i = 0; i< inputArray.length; i++){
            int di = format[i];
            int decimalValue = inputArray[i];
            String format = "%0" + di + "d";
            String rawBinaryValue = Integer.toBinaryString(decimalValue);
            String binaryValue = String.format(format, Integer.parseInt(rawBinaryValue));
            binaryCode.append(binaryValue);
        }
        return binaryCode.toString();
    }

    public static double[] changeBinaryStringIntoArray(String binaryString) {
        String[] charArray = binaryString.split("(?!^)");
        double[] doubleArray = new double[charArray.length];
        for (int i = 0; i < charArray.length; i++){
            doubleArray[i] = Double.parseDouble(charArray[i]);
        }
        return doubleArray;

    }


}

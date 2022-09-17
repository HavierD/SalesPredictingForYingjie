package tech.havier.yingjieduck.DataElement;

import static tech.havier.yingjieduck.DataElement.DataElement.getInputBitsCounts;
import static tech.havier.yingjieduck.DataElement.DataElement.getTotalInputCount;
import static tech.havier.yingjieduck.SqlOperation.getAllDataFromDB;

public class DataElementArray {



    private DataElement[] dataBunch;
    public DataElementArray() throws Exception {
        int[][] allData = getAllDataFromDB();
        dataBunch = new DataElement[allData.length];
        for (int i = 0; i < dataBunch.length; i++) {
            dataBunch[i] = new DataElement(allData[i]);
        }
    }

    /**
     * provide all input binary data nested arrays from database for training.
     * @return
     */
    public double[][] allInputData(){
        double[][] returnedArrays = new double[dataBunch.length][getTotalInputCount()];
        int index =0;
        for(DataElement e : dataBunch){
            int bits = getInputBitsCounts()[index];
            for(int i = 0; i < getTotalInputCount(); i++){

            }
        }
        return null;
    }


}

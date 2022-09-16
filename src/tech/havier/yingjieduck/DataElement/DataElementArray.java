package tech.havier.yingjieduck.DataElement;

import static tech.havier.yingjieduck.SqlOperation.getAllDataFromDB;

public class DataElementArray {
    DataElement[] dataBunch;
    public DataElementArray(int rowCount) throws Exception {
        dataBunch = new DataElement[rowCount];
        int[][] allData = getAllDataFromDB();
        for (int i = 0; i < rowCount; i++) {
            dataBunch[i].setDataElement(allData[i]);
        }
    }
}

package tech.havier.yingjieduck.DataElement;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DataElement {


    public static void main(String[] args) {
    }

     private SetableAndGetable[] dataElement = {
            new Year(),
            new Month(),
            new Date(),
            new LunarYear(),
            new LunarMonth(),
            new LunarDate(),
            new Day(),

            new Rain(),
            new Wind(),
            new TempMark(),
            new HighestTemp(),

            new PublicHoliday(),
            new IsBeforeHoliday(),
            new WorkOnWeekends(),
            new KindergartenHoliday(),
            new PrimarySchoolHoliday(),
            new MiddleSchoolHoliday(),

            new CovidStatus(),
            new OffsetMark(),
            new EndTimeOffset(),

            new Result(),
    };

    /**
     * This method is used to populate one dataset (Decimal)
     * @param dataPile
     */
    public DataElement(int[] dataPile) {
        if (dataPile.length != dataElement.length){
            throw new IllegalArgumentException("data length incorrect!");
        }
        for (int i = 0; i < dataPile.length; i++) {
            dataElement[i].setValue(dataPile[i]);
        }
    }

    public DataElement() {
    }


    public int[] getInputBitsCounts(){
        List<Integer> bitsList = new ArrayList<>();
        for(SetableAndGetable e : dataElement){
            bitsList.add(e.getBITS_COUNT());
        }
        int removedIndex = dataElement.length -1;
        bitsList.remove(removedIndex);
        return bitsList.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * return the number of decimal input for neural network.
     * @return
     */
    public int getTotalInputCount(){
        int input = 0;
        for(int e : getInputBitsCounts()){
            input += e;
        }
        return input;
    }

    public static int getTotalOutputCount(){
        return new Result().getBITS_COUNT();
    }

    /**
     * return a decimal array of all input values
     * @return
     */
    public int[] inputValueArray() {
        List<Integer> returnedArray = new ArrayList<>();
        for(SetableAndGetable e : dataElement){
            returnedArray.add(e.getValue());
        }
        int removedIndex = dataElement.length-1;
        returnedArray.remove(removedIndex);
        return returnedArray.stream().mapToInt(Integer::intValue).toArray();
    }

    public int outputValue() {
        return dataElement[dataElement.length-1].getValue();
    }
}

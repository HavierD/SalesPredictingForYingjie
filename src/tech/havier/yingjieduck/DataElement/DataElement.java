package tech.havier.yingjieduck.DataElement;

import java.util.ArrayList;
import java.util.List;

public class DataElement {
//    private Year year = new Year();
//    private Month month = new Month();
//    private Date date = new Date();
//    private LunarYear lunarYear;
//    private LunarMonth lunarMonth;
//    private LunarDate lunarDate;
//    private Day day;
//
//    private Rain rain;
//    private Wind wind;
//    private TempMark tempMark;
//    private HighestTemp highestTemp;
//
//    private PublicHoliday publicHoliday;
//    private IsBeforeHoliday isBeforeHoliday;
//    private WorkOnWeekends workOnWeekends;
//    private KindergartenHoliday kindergartenHoliday;
//    private PrimarySchoolHoliday primarySchoolHoliday;
//    private MiddleSchoolHoliday middleSchoolHoliday;
//
//    private CovidStatus covidStatus;
//    private OffsetMark offsetMark;
//    private EndTimeOffset endTimeOffset;

    public static void main(String[] args) {
    }

     private static SetableAndGetable[] dataElement = {
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
    //for test, delete quickly


    public static int[] getInputBitsCounts(){
        List<Integer> bitsList = new ArrayList<>();
        for(SetableAndGetable e : dataElement){
            bitsList.add(e.getBITS_COUNT());
        }
        return bitsList.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * return the number of input for neural network.
     * @return
     */
    public static int getTotalInputCount(){
        int input = 0;
        for(int e : getInputBitsCounts()){
            input += e;
        }
        return input;
    }
}

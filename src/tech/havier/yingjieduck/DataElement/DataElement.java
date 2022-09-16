package tech.havier.yingjieduck.DataElement;

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
    public void setDataElement(int[] dataPile) {
        if (dataPile.length != dataElement.length){
            throw new IllegalArgumentException("data length incorrect!");
        }
        for (int i = 0; i < dataPile.length; i++) {
            dataElement[i].setValue(dataPile[i]);
        }
    }
}

package tech.havier.yingjieduck;


public class DataSet {
    private int year;
    private int month;
    private int date;

    private int lYear;
    private int lMonth;
    private int lDate;

    private int day;

    private int rain;
    private int wind;
    private int tempMark;
    private int highestTemp;

    private int isPublicHoliday;
    private int beforeHoliday;
    private int workOnWeekend;

    private int kindergartenHoliday;
    private int primaryHoliday;
    private int middleHoliday;

    private int covidStatus;
    private int offsetMark;
    private int endTimeOffset;

    private int[][] decimalSet;

    public static int[] getFormat10to2() {
        return format10to2;
    }

    private static int[] format10to2 ={
            3, 4, 5,
            3, 4, 5,
            3,
            2, 4, 1, 6,
            1, 1, 1,
            1, 1, 1,
            2, 1, 5};

    interface Importer {
        int[][] fetchDecimalSet();
    }
    interface Exporter{
        void saveDecimalSet(int[][] decimalSet);
    }

    public DataSet(Importer source){
        decimalSet = source.fetchDecimalSet();
    }



    public void exportTo(Exporter destination) {

    }

}

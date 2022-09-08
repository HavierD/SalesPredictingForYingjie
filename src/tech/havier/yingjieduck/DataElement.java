package tech.havier.yingjieduck;


import java.util.Map;

public class DataElement {
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

    private int[] decimalSet;

    private int[] format10to2 ={
            3, 4, 5,
            3, 4, 5,
            3,
            2, 4, 1, 6,
            1, 1, 1,
            1, 1, 1,
            2, 1, 5};

    interface Importer {
        int fetchADataSet();
    }

    public DataElement(){};
    public DataElement(Importer source){

    }
    private void formDecimalSet(){
        decimalSet = new int[]{
                year, month, date, lYear, lMonth, lDate, day,
                rain, wind, tempMark, highestTemp,
                isPublicHoliday, beforeHoliday, workOnWeekend,
                kindergartenHoliday, primaryHoliday, middleHoliday,
                covidStatus, offsetMark, endTimeOffset
        };
    }


    public void export(Importer destination) {

    }

}

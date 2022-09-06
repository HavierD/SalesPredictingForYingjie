package tech.havier.yingjieduck;

public class DataChecking {

    public static void main(String[] args) {
        //for testing
        System.out.println(dataForSQL(20220202, 2022,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2));
    }

    public static String dataChecking(
            int year,
            int month,
            int date,
            int lunarYear,
            int lunarMonth,
            int lunarDate,
            int day,
            int rain,
            int wind,
            int tempMark,
            int highestTemp,
            int isPublicHoliday,
            int isOneDayBeforeHoliday,
            int isWorkOnWeekend,
            int isChildHoliday,
            int isPrimaryHoliday,
            int isMiddleHoliday,
            int covidStatus,
            int offsetMark,
            int endTimeOffset

    ){
        return year + "," +  month + "," +  date + "," +  lunarYear + "," +  lunarMonth + "," +  lunarDate + "," +  day + "," +  rain + "," +  wind + "," +  tempMark + "," +  highestTemp + "," +  isPublicHoliday + "," +  isOneDayBeforeHoliday + "," +  isWorkOnWeekend + "," +  isChildHoliday + "," +  isPrimaryHoliday + "," +  isMiddleHoliday + "," +  covidStatus + "," + offsetMark + "," + endTimeOffset;
    }

    public static String dataForSQL(
            int id,
            int year,
            int month,
            int date,
            int lunarYear,
            int lunarMonth,
            int lunarDate,
            int day,
            int rain,
            int wind,
            int tempMark,
            int highestTemp,
            int isPublicHoliday,
            int isOneDayBeforeHoliday,
            int isWorkOnWeekend,
            int isChildHoliday,
            int isPrimaryHoliday,
            int isMiddleHoliday,
            int covidStatus,
            int offsetMark,
            int endTimeOffset ,
            int result
    ){
        return id + "," + year + "," +  month + "," +  date + "," +  lunarYear + "," +  lunarMonth + "," +  lunarDate + "," +  day + "," +  rain + "," +  wind + "," +  tempMark + "," +  highestTemp + "," +  isPublicHoliday + "," +  isOneDayBeforeHoliday + "," +  isWorkOnWeekend + "," +  isChildHoliday + "," +  isPrimaryHoliday + "," +  isMiddleHoliday + "," +  covidStatus + "," + offsetMark + "," + endTimeOffset + "," + result;
    }

}

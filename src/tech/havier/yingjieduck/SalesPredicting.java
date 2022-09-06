package tech.havier.yingjieduck;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SalesPredicting {

    public static void main(String[] args) {
        double[] a = predictingThis(0,11,31,1,11,31,1,1,1,1,1,1,1,1,1,1,0,1,0,1);
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
    }

    public static double[] predictingThis(
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
        int[] valueArray = {year, month, date, lunarYear, lunarMonth, lunarDate, day, rain, wind, tempMark, highestTemp, isPublicHoliday, isOneDayBeforeHoliday, isWorkOnWeekend, isChildHoliday, isPrimaryHoliday, isMiddleHoliday, covidStatus, offsetMark, endTimeOffset};

        String binaryString = DataFormatting.generateWholeBinaryCode(valueArray);
        double[] binaryPredictedInput = DataFormatting.changeBinaryStringIntoArray(binaryString);
        return binaryPredictedInput;
    }

    private static int[] decimalPredicting(
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
        int[] valueArray = {year, month, date, lunarYear, lunarMonth, lunarDate, day, rain, wind, tempMark, highestTemp, isPublicHoliday, isOneDayBeforeHoliday, isWorkOnWeekend, isChildHoliday, isPrimaryHoliday, isMiddleHoliday, covidStatus, offsetMark, endTimeOffset};

        return valueArray;
        //fixme:
        // parameters -> raw decimal data array
        // - raw decimal data -> to binary methods and to string
        // - binary string -> split and parse into double
        // - binary double array
        //

    }
}




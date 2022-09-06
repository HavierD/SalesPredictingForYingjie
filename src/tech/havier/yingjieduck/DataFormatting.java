package tech.havier.yingjieduck;

import tech.havier.yingjieduck.DataElement.*;


public class DataFormatting {

    private static final int[] binaryDigits = {
            new Year().getDigitNumber(),
            new Month().getDigitNumber(),
            new Date().getDigitNumber(),
            new LunarYear().getDigitNumber(),
            new LunarMonth().getDigitNumber(),
            new LunarDate().getDigitNumber(),
            new Day().getDigitNumber(),
            new Rain().getDigitNumber(),
            new Wind().getDigitNumber(),
            new TempMark().getDigitNumber(),
            new HighestTemp().getDigitNumber(),
            new PublicHoliday().getDigitNumber(),
            new IsBeforeHoliday().getDigitNumber(),
            new WorkOnWeekends().getDigitNumber(),
            new KindergartenHoliday().getDigitNumber(),
            new PrimarySchoolHoliday().getDigitNumber(),
            new MiddleSchoolHoliday().getDigitNumber(),
            new CovidStatus().getDigitNumber(),
            new OffsetMark().getDigitNumber(),
            new EndTimeOffset().getDigitNumber()
    };


    public static void main(String[] args) {





        /**
         * entering data from excel input -> decimal data output
         */
        String a = DataChecking.dataChecking(0, 9,2,0,8,7,5,0,4,1,24,0,0,0,0,0,0,0,0,0);
        System.out.println("Decimal Data is: ");
        System.out.println(a);
        System.out.println("--------");

        /**
         * decimal data input ->binary arrayed data with commas output
         */
        int[] testa = {0,9,2,0,8,7,5,0,4,1,24,0,0,0,0,0,0,0,0,0};
        String binaryString = generateWholeBinaryCode(testa);
        System.out.println("binary data is: " );
        System.out.println(changeBinaryStringIntoArrayForCMD(binaryString));
        System.out.println("--------");

        /**
         * output data for supervising training , decimal data iniput -> binary data with commas output
         */
        System.out.println(generalOutputBinaryCode(15));
    }


    //todo: try to get input from objects
    public static String generateWholeBinaryCode (AbstractData[] inputArray) {
        String binaryCode = "";
        for(AbstractData e : inputArray){
            int di = e.getDigitNumber();
            int decimalValue = e.getIntValue();
            String format = "%0" + di + "d";
            String rawBinaryValue = Integer.toBinaryString(decimalValue);
            String binaryValue = String.format(format, Integer.parseInt(rawBinaryValue));
            binaryCode += binaryValue;
        }
        return binaryCode;
    }

    public static String generateWholeBinaryCode(int[] inputArray){
        StringBuilder binaryCode = new StringBuilder();
        for(int i = 0; i< inputArray.length; i++){
            int di = binaryDigits[i];
            int decimalValue = inputArray[i];
            String format = "%0" + di + "d";
            String rawBinaryValue = Integer.toBinaryString(decimalValue);
            String binaryValue = String.format(format, Integer.parseInt(rawBinaryValue));
            binaryCode.append(binaryValue);
        }
        return binaryCode.toString();
    }

    public static String changeBinaryStringIntoArrayForCMD(String binaryString){
        StringBuilder finalString = new StringBuilder();
        String[] charArray = binaryString.split("(?!^)");
        for(String d : charArray){
            finalString.append(d);
            finalString.append(",");
        }
        return finalString.toString();
    }

    public static double[] changeBinaryStringIntoArray(String binaryString) {
        String[] charArray = binaryString.split("(?!^)");
        double[] doubleArray = new double[charArray.length];
        for (int i = 0; i < charArray.length; i++){
            doubleArray[i] = Double.parseDouble(charArray[i]);
        }
        return doubleArray;

    }

    public static String generalOutputBinaryCode(int output) {
        String rawBinaryOutput = Integer.toBinaryString(output);
        String binaryOutput = String.format("%08d", Integer.parseInt(rawBinaryOutput));
        StringBuilder outputCode = new StringBuilder();
        String[] charArray = binaryOutput.split("(?!^)");
        for (String d : charArray){
            outputCode.append(d);
        }
        return outputCode.toString();
    }
}


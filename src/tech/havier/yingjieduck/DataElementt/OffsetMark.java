package tech.havier.yingjieduck.DataElementt;

public class OffsetMark extends AbstractData{
    private int intValue = 0;
    private String stringValue = String.valueOf(intValue);
    private int digitNumber = 1;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getDigitNumber() {
        return digitNumber;
    }

    public void setDigitNumber(int digitNumber) {
        this.digitNumber = digitNumber;
    }
}

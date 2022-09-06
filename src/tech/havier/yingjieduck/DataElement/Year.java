package tech.havier.yingjieduck.DataElement;

public class Year extends AbstractData {

    private int intValue = 0;
    private String stringValue = "0";
    private int digitNumber = 3;

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

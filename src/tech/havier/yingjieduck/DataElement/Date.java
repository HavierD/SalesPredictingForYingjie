package tech.havier.yingjieduck.DataElement;

public class Date implements SetableAndGetable{
    private int value;
    public static final int BITS_COUNT = 5;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getBITS_COUNT() {
        return BITS_COUNT;
    }
}

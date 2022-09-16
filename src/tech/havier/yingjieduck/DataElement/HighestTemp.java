package tech.havier.yingjieduck.DataElement;

public class HighestTemp implements SetableAndGetable{

    private int value = 0;
    public final int BITS_COUNT = 6;
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

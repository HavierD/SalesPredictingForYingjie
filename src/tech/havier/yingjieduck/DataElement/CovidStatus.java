package tech.havier.yingjieduck.DataElement;

public class CovidStatus implements SetableAndGetable{
    private int value;
    private final int BITS_COUNT = 2;

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

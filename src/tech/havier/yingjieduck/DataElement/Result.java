package tech.havier.yingjieduck.DataElement;

public class Result implements SetableAndGetable{
    private int value;
    private final int BITS_COUNT = 9;


    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getBITS_COUNT() {
        return BITS_COUNT;
    }
}

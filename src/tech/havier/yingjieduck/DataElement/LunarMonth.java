package tech.havier.yingjieduck.DataElement;

public class LunarMonth implements SetableAndGetable{
    private int value;
    public final int BITS_COUNT = 4;
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

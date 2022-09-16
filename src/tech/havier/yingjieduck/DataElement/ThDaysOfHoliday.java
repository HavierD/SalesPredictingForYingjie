package tech.havier.yingjieduck.DataElement;

public class ThDaysOfHoliday implements SetableAndGetable{
    private int value;    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getBITS_COUNT() {
        return BITS_COUNT;
    }
    public final int BITS_COUNT = 4;

}

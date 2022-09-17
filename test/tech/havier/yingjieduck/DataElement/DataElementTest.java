package tech.havier.yingjieduck.DataElement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tech.havier.yingjieduck.DataElement.DataElement.getInputBitsCounts;
import static tech.havier.yingjieduck.DataElement.DataElement.getTotalInputCount;

class DataElementTest {

    int[] bitsArray;
    int total = 0;
    DataElement dataElement;

    @BeforeEach
    public void init() {
        bitsArray = new int[]{3, 4, 5, 3, 4, 5, 3, 2, 4, 1, 6, 1, 1, 1, 1, 1, 1, 2, 1, 5};
        for (int e : bitsArray) {
            total += e;
        }

    }

    @Test
    public void testBitsCount() {
        assertArrayEquals(bitsArray, getInputBitsCounts());
    }

    @Test
    public void testTotalInputCount() {

        assertEquals(total,getTotalInputCount() );
    }

    @Test
    public void testSetDataElement() {
        int[] e = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0,1};



    }

}
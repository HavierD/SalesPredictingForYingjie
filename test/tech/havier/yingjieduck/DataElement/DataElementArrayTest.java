package tech.havier.yingjieduck.DataElement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DataElementArrayTest {

    DataElementArray dataElementArray;

    @BeforeEach
    public void init() throws Exception {
        dataElementArray = new DataElementArray();
    }

    @Test
    @DisplayName("convert int[] into a String binary code")
    public void convert1() throws Exception {
        int[][] int1 = {{0,8,26,0,7,29,5,0,5,1,29,0,0,0,1,1,1,0,0,2}};
        double[][] int11 =  {
                {0,0,0,1,0,0,0,1,1,0,1,0,0,0,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,1,0,1,1,0,1,1,1,0,1,0,0,0,1,1,1,0,0,0,0,0,0,1,0}
        };
//        assertEquals("000100011010000011111101101000101101110100011100000010",generateWholeBinaryCode(int1) );
//        assertEquals(int11, allInputData() );
//        double [][] d2 = dataElementArray.allInputData(int1);
//        assertArrayEquals(int11, d2);
    }


}
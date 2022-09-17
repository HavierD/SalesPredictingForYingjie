package tech.havier.yingjieduck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tech.havier.yingjieduck.SqlOperation.getAllDataFromDB;

class SqlOperationTest {

    @Test
    public void requestDataTest() throws Exception {
        int[][] data = getAllDataFromDB();
        assertEquals(11, data.length);
        assertEquals(21, data[0].length);
    }

}
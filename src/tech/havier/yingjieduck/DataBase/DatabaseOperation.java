package tech.havier.yingjieduck.DataBase;

import tech.havier.yingjieduck.DataChecking;
import tech.havier.yingjieduck.DataFormatting;

import java.sql.*;
import java.util.Arrays;


public class DatabaseOperation {

    static ConfigHavi2 config = new ConfigHavi2();
    /**
     * operation part
     */
    public static void main(String[] args) {

//        submitWholeSalesData();
//        finalInputSetForTraining();
//        finalResultSetForTraining();
    }

    public static void submitWholeSalesData(){

        final String aWholeSalesDataValue = DataChecking.dataForSQL(
                20220905,
                0,9,5,
                0,8,10,
                1,
                0,2,
                1,26,
                0,0,0,
                0,0,0,
                0,
                0,0,
                18
        );
        final String aWholeSalesDataSQL = "insert into sales_data values (" + aWholeSalesDataValue + ")";

        insertData(aWholeSalesDataSQL);
    }

    private static void insertData(String aWholeSalesDataSQL) {

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", config.a, config.b);
            Statement statement = connection.createStatement();

            statement.executeUpdate(aWholeSalesDataSQL);
            connection.close();
        }catch (Exception e){
            System.out.println("something wrong: " + e);
        }
    }



}

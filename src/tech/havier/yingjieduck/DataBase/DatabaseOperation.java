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

//    public static double[][] finalResultSetForTraining() throws SQLException {
//
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", config.a, config.b );
//
////            int rowCount = getRowCount(connection);
////            double[][] returnedResult = new double[rowCount][];
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT RESULT FROM SALES_DATA order by id");
//
//
//            int nestingIndex = 0;
//            while (resultSet.next()) {
//                int oneResult = resultSet.getInt(1);
//                String binaryStringCode = DataFormatting.generalOutputBinaryCode(oneResult);
//                double[] oneResultDouble = DataFormatting.changeBinaryStringIntoArray(binaryStringCode);
////                returnedResult[nestingIndex] = oneResultDouble;
//                nestingIndex++;
//            }
//            System.out.println("nested result set collection is: " + Arrays.deepToString(returnedResult));
//            connection.close();
//
//            return  returnedResult;
//
//        }catch (Exception e){
//            throw new SQLException("something wrong: " + e);
//        }
//    }

//    public static double[][] finalInputSetForTraining() throws SQLException {
//
//        try{
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", config.a, config.b);
//
//            int rowCount = getRowCount(connection);
//            double[][] returnedInput = new double[rowCount][];
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM SALES_DATA order by id");
//
//            int columnCount = resultSet.getMetaData().getColumnCount();
//
//            System.out.println(columnCount);
//            int nestingIndex = 0;
//            while (resultSet.next()){
//                int[] oneRow = new int[columnCount - 2];
//                for(int i=2; i<=columnCount-1; i++){
//                    oneRow[i - 2] = resultSet.getInt(i);
//                }
//                String binaryStringCode = DataFormatting.generateWholeBinaryCode(oneRow);
//                double[] oneRowDouble = DataFormatting.changeBinaryStringIntoArray(binaryStringCode);
//                returnedInput[nestingIndex] = oneRowDouble;
//                nestingIndex++;
//
//            }
//            System.out.println("nested input set collection is: " + Arrays.deepToString(returnedInput));
//
//            connection.close();
//
//            return returnedInput;
//
//        }catch (Exception e){
//            throw new SQLException("something wrong: " + e);
//        }
//    }

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

package tech.havier.yingjieduck;

import tech.havier.yingjieduck.DataBase.ConfigHavi2;
import tech.havier.yingjieduck.DataElement.DataElement;

import java.sql.*;
import java.util.Arrays;

public class SqlOperation {


    static ConfigHavi2 config = new ConfigHavi2();


    public static DataElement[] populateAllDataIntoDataElement() throws Exception {
        int[][] allData = getAllDataFromDB();
        DataElement[] dataBunch = new DataElement[allData.length];
        for (int i = 0; i < allData.length; i++){
            dataBunch[i].setDataElement(allData[i]);
        }
        return dataBunch;
    }
    public static int[][] getAllDataFromDB() throws Exception {
        try {
        Connection connection = getConnection();
        int rowCount = getRowCount(connection);
        int[][] returnedResult = new int[rowCount][];

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM SALES_DATA order by id");

            ResultSet allInputResultSet = resultSet;

            int columnCount = allInputResultSet.getMetaData().getColumnCount();
            int nestingIndex = 0;
            while (allInputResultSet.next()) {
                int[] oneRow = new int[columnCount - 1];
                for(int i=1; i<=columnCount-1; i++){
                    oneRow[i - 1] = allInputResultSet.getInt(i+1);
                }
                returnedResult[nestingIndex] = oneRow;
                nestingIndex++;
            }
            return returnedResult;
        } catch (Exception e) {
            throw new Exception("Something wrong: " + e);
        }
    }

    /**
     * Include all input data and all result data
     * @return
     * @throws SQLException
     */
    public static double[][] getAllOutputsFromDB() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", config.a, config.b );

            int rowCount = getRowCount(connection);
            double[][] returnedResult = new double[rowCount][];

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT RESULT FROM SALES_DATA order by id");

            int nestingIndex = 0;
            while (resultSet.next()) {
                int oneResult = resultSet.getInt(1);
                String binaryStringCode = DataFormatting.generalOutputBinaryCode(oneResult);
                double[] oneResultDouble = DataFormatting.changeBinaryStringIntoArray(binaryStringCode);
                returnedResult[nestingIndex] = oneResultDouble;
                nestingIndex++;
            }
            System.out.println("nested result set collection is: " + Arrays.deepToString(returnedResult));
            connection.close();
            return  returnedResult;
        }catch (Exception e){
            throw new SQLException("something wrong: " + e);
        }
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                config.a, config.b );
        return connection;
    }


    private static int getRowCount(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        int rowCount = -1;
        ResultSet rowCountSet = statement.executeQuery("SELECT COUNT(*) FROM SALES_DATA");
        while (rowCountSet.next()) {
            rowCount = rowCountSet.getInt(1);
        }
        if (rowCount < 0) {
            throw new SQLException("no data got from database");
        }
        return rowCount;
    }
}

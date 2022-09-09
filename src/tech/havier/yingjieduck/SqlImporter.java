package tech.havier.yingjieduck;

/**
 * will it be three?
 */
public class SqlImporter implements DataSet.Importer{
    private int[][] sqlSet;




    public SqlImporter(int[][] sqlSet){
        this.sqlSet = sqlSet;
    }

    @Override
    public int[][] fetchDecimalSet() {
        return sqlSet;
    }
}

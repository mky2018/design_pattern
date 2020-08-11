package com.mky.design.principle.compositionaggregation;

/**
 * @author makaiyu
 * @date 2020-05-03 16:51
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用" + connection + "增加产品");
    }

}

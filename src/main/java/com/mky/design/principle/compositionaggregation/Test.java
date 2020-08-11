package com.mky.design.principle.compositionaggregation;

/**
 * @author makaiyu
 * @date 2020-05-03 16:52
 */
public class Test {

    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();

    }

}

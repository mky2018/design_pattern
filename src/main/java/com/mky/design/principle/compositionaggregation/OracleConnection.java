package com.mky.design.principle.compositionaggregation;

/**
 * @author makaiyu
 * @date 2020-05-03 16:54
 */
public class OracleConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "Oracle 数据库连接";
    }
}

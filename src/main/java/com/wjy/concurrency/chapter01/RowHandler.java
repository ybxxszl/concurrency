package com.wjy.concurrency.chapter01;

import java.sql.ResultSet;

public interface RowHandler<T> {

    T handle(ResultSet resultSet);

}

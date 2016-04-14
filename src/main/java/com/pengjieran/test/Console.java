package com.pengjieran.test;

import com.alibaba.druid.sql.builder.SQLBuilderFactory;
import com.alibaba.druid.sql.builder.SQLSelectBuilder;
import com.alibaba.druid.sql.builder.SQLUpdateBuilder;
import com.alibaba.druid.util.JdbcConstants;
import com.pengjieran.util.PropertyUtil;
import org.junit.Test;

import java.io.File;
import java.util.Properties;

/**
 * Created by aaron on 2016/4/7.
 */
public class Console {

    @Test
    public void main() {

        String path = "config" + File.separator + "alipay.properties";
        Properties properties = PropertyUtil.load(path);
        String property = properties.getProperty("alipay.charset");
        System.out.println(property);
    }

    @Test
    public void select() {

        SQLSelectBuilder sqlBuilder = SQLBuilderFactory.createSelectSQLBuilder(JdbcConstants.MYSQL);

        sqlBuilder.from("tb1", "t1");
        String string = sqlBuilder.select("id","name","age").whereAnd("a=3 and b=6").whereAnd("c=5").orderBy("id ASC").toString();
        System.out.println(string);
    }

    @Test
    public void Insert() {

        SQLUpdateBuilder updateBuilder = SQLBuilderFactory.createUpdateBuilder(JdbcConstants.MYSQL);
    }
}

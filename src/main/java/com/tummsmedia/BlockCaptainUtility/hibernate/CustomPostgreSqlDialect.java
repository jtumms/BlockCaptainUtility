package com.tummsmedia.BlockCaptainUtility.hibernate;

/**
 * Created by john.tumminelli on 10/28/17.
 */
import org.hibernate.dialect.PostgreSQL94Dialect;

import java.sql.Types;

public class CustomPostgreSqlDialect extends PostgreSQL94Dialect {

    public CustomPostgreSqlDialect() {
        this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }
}

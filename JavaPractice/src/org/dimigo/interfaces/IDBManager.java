package org.dimigo.interfaces;

/**
 * Created by sun90 on 2017-05-24.
 */
public interface IDBManager {

    String ORACLE_DATABASE = "ORACLE";
    String SYBASE_DATABASE = "SYBASE";

    void insert();

    void search();

    void update();

    void delete();

    static IDBManager getDBObject(String database) {
        if (database == null) {
            return null;
        } else if (ORACLE_DATABASE.equalsIgnoreCase(database)) {
            return new OracleDB();
        } else if (SYBASE_DATABASE.equalsIgnoreCase(database)) {
            return new SybaseDB();
        } else {
            return null;
        }
    }
}

package org.dimigo.interfaces;

/**
 * Created by sun90 on 2017-05-24.
 */
public class DBTest {

    public static void main(String[] args) {

        System.out.println("<< 변경 전 >>");


        // Sybase DB
        crud(IDBManager.getDBObject(IDBManager.SYBASE_DATABASE));

        System.out.println("\n<< 변경 후 >>");

        // Oracle DB
        crud(IDBManager.getDBObject(IDBManager.ORACLE_DATABASE));
    }

    public static void crud(IDBManager db) {
        db.insert();
        db.search();
        db.update();
        db.delete();
    }
}

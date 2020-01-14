/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.helper;

/**
 *
 * @author nle
 */
public class constant {
    public static String listTables() {
        return "SELECT table_name \n" + 
                "FROM information_schema.tables \n" + 
                "WHERE table_schema='public'";
    }
    public static String listTablWithSchema(String prefix) {
        return "SELECT table_schema, table_name \n" +
        "FROM information_schema.tables \n" +
        "WHERE table_name ~ '^"+prefix+"'";
    }
}

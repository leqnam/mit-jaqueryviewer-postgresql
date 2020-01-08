/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.helper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nam Le
 */
public class util {

    public static void showMessageBox(java.awt.Component c, String message) {
//        StringBuilder sb = new StringBuilder(ex.getMessage());
//        int i = 0;
//        while ((i = sb.indexOf(" ", i + 60)) != -1) {
//            sb.replace(i, i + 1, "\n");
//        }
        javax.swing.JOptionPane.showMessageDialog(c, message, "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    public static String getCurrentDateTimeToString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return format.format(new Date());
    }

    public static String dateTimeToString(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

    public static Date dateTimeToDateTime(String datestr) {
        Date dtt = null;

        try {
            DateFormat formatter;
            formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            dtt = (Date) formatter.parse(datestr);
        } catch (Exception e) {
        }

        return dtt;
    }

    public static java.sql.Date getCurrentDate() {
        java.util.Date utilDate = new java.util.Date();
        return new java.sql.Date(utilDate.getTime());
    }

    public static long getCurrentTimeMilliseconds() {
        Date date = new Date();
        return date.getTime();
    }

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle;

import java.sql.ResultSet;
import java.sql.Statement;
import static namle.helper.connector.getConnection;

/**
 *
 * @author Nam Le
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        mainJFrame main = new mainJFrame();
//        main.pack();
//        main.setLocationRelativeTo(null);
//        main.setVisible(true);
        main.show();
//        ResultSet rs;
//        Statement st = getConnection().createStatement();
//        String query = "select * from \"NhanVien\"";
//        boolean ret = st.execute(query);
//        if (ret) {
//          rs = st.getResultSet();
//            System.out.println(rs);
//        } else {
//          //rs = st.executeQuery("SELECT * FROM [" + tableName + "] LIMIT 100");
//        }
    }
    
}

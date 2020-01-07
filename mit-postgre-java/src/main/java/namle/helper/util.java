/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namle.helper;

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
}

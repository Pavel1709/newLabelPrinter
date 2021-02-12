/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newlabelprinter;

import db.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author pmolchanov
 */
public class NewLabelPrinter {

    /**
     * @param args the command line arguments
     */
    public static DBConnector dbc1;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        dbc1 = new DBConnector("com.ibm.as400.access.AS400JDBCDriver", "jdbc:as400://G2IPGCSRU1", "UFM03AOFIT", "UFM03AOFIT");
        dbc1.connect();
        FrameForCodes ffc = new FrameForCodes();
        ffc.setVisible(true);
        ffc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

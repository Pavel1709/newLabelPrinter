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
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        dbc1 = new DBConnector("", "", "", "");
        
        dbc1.connect();
        FrameForCodes ffc = new FrameForCodes();
        ffc.setVisible(true);
        ffc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

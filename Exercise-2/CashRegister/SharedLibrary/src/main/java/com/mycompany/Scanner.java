/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dan
 */
package com.mycompany;

import javax.swing.*;


public class Scanner extends JFrame {
    
    public int scan() {
        String sUPC = JOptionPane.showInputDialog("UPC (0000 - 0006):");
        int UPC = Integer.parseInt(sUPC);
        return UPC;
    }
}

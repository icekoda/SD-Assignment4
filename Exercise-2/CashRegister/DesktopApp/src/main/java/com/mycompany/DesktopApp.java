/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;


  
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author dan
 */
public class DesktopApp extends JFrame {
    
    private CashRegister cashRegister = new CashRegister();
    public DesktopApp(){
        super();
        init();
    }
    
    private void init(){
        JButton scanItem = new JButton("Enter/Scan Item UPC");
        scanItem.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e){
           cashRegister.setCurrentProductUPC(cashRegister.scanner().scan());
           cashRegister.update(); 
            }
        });
        
        setLayout(new GridLayout(2,1));
        add(new JLabel("Cash Register", SwingConstants.CENTER));
        add(scanItem);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });
    }
}

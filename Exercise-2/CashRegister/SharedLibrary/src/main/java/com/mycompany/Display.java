/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dan
 */
public class Display extends JFrame {
    
    public void displayProduct(Product product){
        String productInfo = String.format("<html>Name: %s <br/>Price: %s <br/> UPC: 000%s </html>", product.name,product.price,product.upc);
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            Display display = new Display();
            display.setVisible(true);
            display.add(new JLabel(productInfo));
            display.repaint();
        }
        });
    }
    
    
    public Display() throws HeadlessException {
        super("Cash Register");
        init();
    }
    
    public static void main(String[] args) {
    
    }

    private void init() {
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 180);
        setLocationRelativeTo(null);
    }
    
    public void displayText(String s) {
        Frame frame = new Frame();
        frame.setSize(380, 380);

        JOptionPane.showMessageDialog(frame, s);
    }
}

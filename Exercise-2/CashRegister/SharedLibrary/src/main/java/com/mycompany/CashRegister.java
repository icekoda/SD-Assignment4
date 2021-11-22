/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;


/**
 *
 * @author dan
 */
public class CashRegister {
    private Product current;
    private Scanner scanner = new Scanner();
    private Display display = new Display();
    private ProductDB database = new ProductDB();
    
    public Product getCurrentProductInfo(Product product){
        return product;
    }
    
    public Scanner scanner(){
        return this.scanner;
    }
    
    public void setCurrentProductUPC(int UPC){
        current = database.GetProductInfo(UPC);
    }
    
    public void update(){
        display.displayProduct(current);
    }
}

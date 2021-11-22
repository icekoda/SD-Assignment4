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

public class ProductDB {
    Product cups = new Product("cups",4.99,0000);
    Product beer = new Product("beer",24.99,0001);
    Product apples = new Product("apples",1.99,0002);
    Product milk = new Product("milk",2.99,0003);
    Product juice = new Product("juice",2.50,0004);
    Product umbrella = new Product("umbrella",9.99,0005);
    Product lysol = new Product("lysol",5.99,0006);
    
    public Product GetProductInfo(int UPCCode) {
        switch (UPCCode) {
            case 0000:
                return cups;
            case 0001:
                return beer;
            case 0002:
                return apples;
            case 0003:
                return milk;
            case 0004:
                return juice;
            case 0005:
                return umbrella;
            case 0006:
                return lysol;
            default:
                return null;
        }
    }
}
        

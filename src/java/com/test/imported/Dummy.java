package com.test.imported;


import java.text.DecimalFormat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3129916
 */
public class Dummy {
    
    public static void main(String...a){
        DecimalFormat form = new DecimalFormat("#.##");
        String d= form.format(415454.54212);
        System.out.println(d);
        
        
        
    }
}
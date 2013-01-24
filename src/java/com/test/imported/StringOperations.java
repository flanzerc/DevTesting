package com.test.imported;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3129916
 */
public class StringOperations {
    
     private final static Logger logger = Logger.getLogger(StringOperations.class.getName());

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String a = "a";
        String b = "b";
        for (int i = 0; i < 1000; i++) { //ten million times
            String c = a.concat(b);
        }

        long end = System.currentTimeMillis();
        System.out.println("With concat operator " +(end - start));
        
        // ============================
        long start2 = System.currentTimeMillis();
        String a2 = "a";
        String b2 = "b";
        for (int j = 0; j < 1000; j++) { //ten million times
            String c2 = a2 + b2;
//            System.out.println(c2);
            logger.log(Level.INFO, c2);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("With + operator " + (end2 - start2));
        
    }
}

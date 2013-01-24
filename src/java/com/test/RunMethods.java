/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.text.DecimalFormat;
import java.util.Calendar;

/**
 *
 * @author 3129916
 */
public class RunMethods {

    public static void main(String[] args) {
        Truck obj = new Truck();
//        System.out.println("Constructor : " );
        

        System.out.println("11/23/2012".equals("11/23/2012"));
        int i = 9;
        DecimalFormat df = new DecimalFormat("00");
        for(int z=1; z<20; z++) {
            System.out.println(df.format(z));
            
        }
//        System.out.println(String.format("%5d", i));

    }
}

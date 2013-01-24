package com.test.imported;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 3129916
 */
public class DateDiffOperation {

    public static void main(String[] args) {
        
        TimeZone tz = Calendar.getInstance().getTimeZone();
        System.out.println("TimeZone: " + tz.getDisplayName());
        System.out.println("ID: " + tz.getID());

        System.out.println(Locale.getDefault());
        System.out.println(new Date());

        
        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(date);
        System.out.println("Today : " + today);
        String[] s = today.split("/");
        System.out.println(s[0]);

        System.out.println("@@@@@"+Integer.parseInt("09"));

        Date start = new Date(2012, 10, 14); // yyyy, mm, dd
        Date end = new Date(2012, 11, 14);

        long diffInMillis = end.getTime() - start.getTime();
        long diffInDays = diffInMillis / 1000 / 86400; //2592000;
        long diffInYear = diffInMillis / 1000 / 86400 / 365;
        
        System.out.println("==> " + diffInDays);
        System.out.println("InYear = " + diffInYear);
        
        Date st = new Date("09/11/2012");
        Date e = new Date("12/11/2012");
        long diff = e.getTime() - st.getTime();
        long d = diff/1000/86400;
        System.out.println(d);
        
        
        
        
        //==========
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

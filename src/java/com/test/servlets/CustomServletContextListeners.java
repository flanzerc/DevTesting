/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class CustomServletContextListeners implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Custom listeners initializes from context : "  + sce.getServletContext().getContextPath());
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Custom listeners destroyed.");
    }
 
}

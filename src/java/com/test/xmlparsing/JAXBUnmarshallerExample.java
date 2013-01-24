/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.xmlparsing;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author 3129916
 */
public class JAXBUnmarshallerExample {

    public static void main(String args[]) {
        try {
            File file = new File("D:\\file.xml");
            JAXBContext jxContext = JAXBContext.newInstance(Customer.class);
            Unmarshaller unmarshaller = jxContext.createUnmarshaller();

            Customer customer = (Customer) unmarshaller.unmarshal(file);
            System.out.println("AGE: " + customer.getAge());
            System.out.println("NAME: " + customer.getName());
            System.out.println(customer);


        } catch (JAXBException ex) {
            Logger.getLogger(JAXBUnmarshallerExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

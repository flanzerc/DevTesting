package com.test.imported;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3129916
 */
public class StudentService {

    public static void createUsingRef() throws Exception {
      Class student = Class.forName("Student2");
      System.out.println(student.getName());
    }
     
    public static void createUsingNew() {
      Student2 s = new Student2();
        System.out.println("@@");
    }
    
    public static void main(String[] args) throws Exception {
        createUsingRef();
        createUsingNew();
    }
    
}

 
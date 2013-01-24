package com.test.imported;


import java.io.File;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 3129916
 */
public class Test {
    private String fPath;

    public Test() {
        String path;
        path = getClass().getClassLoader().getResource(".").getPath();
        this.fPath = path;
    }
    
    
    public static void main(String...a){
        System.out.println("......................@@@@@@@@@@3");
        
        Test t = new Test();
        System.out.println(">>"+ t.fPath);
        System.out.println("<<" + System.getProperty("user.dir").replace("\\", "/"));
//        File f = new File(System.getProperty("user.dir").replace("\\", "/") +"/Web Pages/WEB-INF/TEST");
        File f = new File("src/TEST");
        if(!f.mkdir()) {
            System.out.println("NOT");
        } else {
            System.out.println("DONE");
        }
    }
    
}

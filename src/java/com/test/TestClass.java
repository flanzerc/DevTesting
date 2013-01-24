/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

import java.util.StringTokenizer;

/**
 *
 * @author 3129916
 */
public class TestClass {

    public static void main(String[] args) {
        String s = "ABAAAACAA";
//        StringTokenizer stoken = new StringTokenizer(s, "A");
//        System.out.println("count=" + stoken.countTokens());
//        while(stoken.hasMoreElements()) {
//            System.out.println("$$ " + stoken.nextToken());
//        }
        String[] sa = s.trim().split("A");
        System.out.println(s.toCharArray()[0] + "Size:" + sa.length + ":" + sa[0] + "::" + sa[1]);
        for(String s1: sa) {
            System.out.println("===" + s1);
        }
    }

}

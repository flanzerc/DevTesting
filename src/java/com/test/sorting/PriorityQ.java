/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.sorting;

/**
 *
 * @author 3129916
 */
public class PriorityQ {

    private int maxSize;
    private double[] queArray;
    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new double[maxSize];
        nItems = 0;
    }

    public void insert(double item) {
        int j;
        if(nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for(j=nItems-1; j>=0; j--) {
                if(item > queArray[j]) {
                    queArray[j+1] = queArray[j];
                } else {
                    break;
                }
            }

            queArray[j+1] = item;
            nItems++;
        }
    }
}

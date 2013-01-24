/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.sorting;

/**
 *
 * @author 3129916
 */
public class SelectionSort {

    private double[] a;
    private int nElems;

    public SelectionSort(int max) {
        a = new double[max];
        nElems = 0;
    }

    public void insert(double value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {// displays array contents
        for (int j = 0; j < nElems; j++) {// for each element,
            System.out.print(a[j] + " "); // display it
        }
        System.out.println("");
    }

    public void selectSort() {
        int out, in, min;
        for(out = 0; out < nElems -1 ; out++) {
            min = out;
            for(in = out+1; in < nElems; in++)
                if(a[in] < a[min])
                    min = in;
            swap(out, min);
        }
    }

    private void swap(int one, int two) {
        double temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
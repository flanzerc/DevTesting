/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.sorting;

/**
 *
 * @author 3129916
 */
public class SelectionSortImpl {

    public static void main(String args[]) {
        int maxSize = 10;
        SelectionSort selsort;
        selsort = new SelectionSort(maxSize);
        prepareData(selsort);
        selsort.display();

        selsort.selectSort();
        System.out.println("=====");
        selsort.display();
    }

    private static void prepareData(SelectionSort ss) {
        ss.insert(15);
        ss.insert(59);
        ss.insert(32);
        ss.insert(03);
        ss.insert(105);
        ss.insert(19);
        ss.insert(07);
        ss.insert(79);
        ss.insert(85);
        ss.insert(45);
    }
}

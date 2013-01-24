/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author 3129916
 */
public abstract class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle Abstarct called");
    }

}


class Car extends Vehicle {
    public Car() {
        System.out.println("Car is called ..");
    }
}

class Truck extends Car {
    public Truck() {
        System.out.println("Truck is called ..");
    }

}
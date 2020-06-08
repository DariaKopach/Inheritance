/*
 * Inheritance
 *
 * Version from 08.06.2020
 *
 * Copyright Kopach Daria KNTEU
 *
 * 1. Create a child  from the class Rectangle.
 *
 * 2. Create another class as a super class for your one.
 *   Or create a daughterly class for your one.
 *
 */

package com.company;


public class Main {

    public static void main(String[] args) {

        Rhombus rhombus = new Rhombus(4, Math.PI / 5);
        System.out.println(rhombus);
        System.out.println("The rhombus's hashcode is " + rhombus.hashCode());

        Rhombus rhombus2 = new Rhombus(5, Math.PI / 6);

        // compare two rhombus
        System.out.println("Is those two rhombus are equal? "
                + rhombus.equals(rhombus2));

        Window ourWindow = new Window(60,
                50,
                "syrup",
                "wooden",
                20000,
                3,
                true);

        System.out.println(ourWindow);
    }
}

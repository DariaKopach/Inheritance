/*
 *
 * Classname Rectangle
 *
 * Version from 08.06.2020
 *
 * Copyright Kopach Daria KNTEU
 *
 */
package com.company;

import java.util.Objects;

public class Rectangle {

    private int length;
    private int width;


    //POJO - plane old java object
    // 1. Constructor:
    // a) generate an empty constructor

    public Rectangle (){
    }

    // b) generate the full constructor

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    // 2. Generate getters and setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // method of calculating the area

    public double getArea() {
        return this.getLength()* this.getWidth();
    }

    // method of calculating the perimeter

    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public String toString() {
        return " Rectangle { " +
                "length = " + length +
                ", width = " + width +
                ", Area = " + this.getArea()+
                ", Perimeter = " + this.getPerimeter() +
                '}';
    }
}
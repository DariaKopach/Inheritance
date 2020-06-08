/*
 *
 * Classname Rhombus
 *
 * Version from 08.06.2020
 *
 * Copyright Kopach Daria KNTEU
 *
 * 2. Create another class as a super class for your one.
 *   Or create a daughterly class for your one.
 *
 */
package com.company;

import java.util.Objects;

public class Rhombus extends Parallelogram {

    private int side;
    private double angle;

    // generate the constructor

    public Rhombus(int side, double angle) {
        super(side, side, angle);
        this.side = side;
        this.angle = angle;
    }

    // generate getters and setters

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getAngle() {
        return angle;
    }

    @Override
    public void setAngle(double angle) {
        this.angle = angle;
    }

    // to String for Rhombus using Parallelogram's methods

    @Override
    public String toString() {
        return "Rhombus {" +
                "side=" + side +
                ", angle=" + angle +
                ",\n Perimeter = " + this.getPerimeter() +
                ",\n Area = " + this.getArea() +
                ",\n Short Diagonal = " + this.getShortDiagonal() +
                ",\n Long Diagonal = " + this.getLongDiagonal() +
                ",\n It is a rhombus = " + this.isRhombus() +
                '}';
    }

    // Generate equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rhombus rhombus = (Rhombus) o;
        return side == rhombus.side &&
                Double.compare(rhombus.angle, angle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side, angle);
    }
}

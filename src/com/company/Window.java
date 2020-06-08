/*
 *
 * Classname Window (inheritance to Rectangle)
 *
 * Version from 08.06.2020
 *
 * Copyright Kopach Daria KNTEU
 *
 * 1.Create a child  from the class Rectangle.
 *
 */
package com.company;

public class Window extends Rectangle {
    private String colour;
    private String material;
    private int price;
    private int sectorsAmount;
    private boolean ecoWindow;

    // Generate the constructor

    public Window(int length, int width, String colour, String material, int price,
                  int sectorsAmount, boolean ecoWindow) {
        super(length, width);
        this.colour = colour;
        this.material = material;
        this.price = price;
        this.sectorsAmount = sectorsAmount;
        this.ecoWindow = ecoWindow;
    }

    // Generate getters and setters


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSectorsAmount() {
        return sectorsAmount;
    }

    public void setSectorsAmount(int sectorsAmount) {
        this.sectorsAmount = sectorsAmount;
    }

    public boolean isEcoWindow() {
        return ecoWindow;
    }

    public void setEcoWindow(boolean ecoWindow) {
        this.ecoWindow = ecoWindow;
    }

    // Generate toString

    @Override
    public String toString() {
        return "Window {" +
                " colour = '" + colour + '\'' +
                ", material = '" + material + '\'' +
                ", price = " + price +
                ", sectorsAmount = " + sectorsAmount +
                ", ecoWindow = " + ecoWindow +
                '}';
    }


}

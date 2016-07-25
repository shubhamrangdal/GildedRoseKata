package com.bitwise.GildedRose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shubham on 24/07/2016.
 */
public class Item {
    public String name;
    public int sellIn;
    public int quality;
    List<Item> list = new ArrayList<Item>();

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        list.add(this);
    }

    public Item() {

    }


    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

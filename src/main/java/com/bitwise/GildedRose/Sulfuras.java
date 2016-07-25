package com.bitwise.GildedRose;

/**
 * Created by Shubham on 24/07/2016.
 */
public class Sulfuras implements UpdateQualityInterface {
    @Override
    public int updateQuality(Item item) {

        //if(item.quality!=80)
          //  throw new QualityMustBe80Exception();
        return item.quality;
    }

    @Override
    public void addItem() {
        Item item[]= new Item[]{new Item("Sulfuras Item 1 ", 8, 12),
                new Item("Sulfuras Item 2 ", 5, 10),
                new Item("Sulfuras Item 3 ", 15, 30)};
        updateAndPrint(item);
    }

    public void updateAndPrint(Item[] item) {
        for (Item items : item) {
            updateQuality(items);
            System.out.println(items);
        }
    }

    public class QualityShouldNotbeIncreases extends RuntimeException {
    }


    public class QualityMustBe80Exception extends RuntimeException{
    }
}
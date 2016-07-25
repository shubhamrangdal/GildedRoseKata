package com.bitwise.GildedRose;

/**
 * Created by Shubham on 24/07/2016.
 */
public class Conjured implements UpdateQualityInterface {
    @Override
    public int updateQuality(Item item) {
        daysDecrement(item);
        item.quality -= 2;
        return item.quality;
    }

    private void daysDecrement(Item item) {
        if(item.sellIn >=0)
            item.sellIn--;
        else{
            item.sellIn=0;
            item.quality -=2;
        }
    }

    @Override
    public void addItem() {
        Item item[]={new Item("Conjured Item 1 ",8,12),
                new Item("Conjured Item 2 ",5,10),
                new Item("Conjured Item 3 ",15,30)};
        System.out.println("  Day 1  ");
        updateAndPrint(item);
    }

    public void updateAndPrint(Item[] item) {
        for (Item items : item) {
            updateQuality(items);
            System.out.println(items);
        }
    }


}

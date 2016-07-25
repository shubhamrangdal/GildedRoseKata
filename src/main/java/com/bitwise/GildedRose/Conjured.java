package com.bitwise.GildedRose;

/**
 * Created by Shubham on 24/07/2016.
 */
public class Conjured implements UpdateQualityInterface {
    @Override
    public int updateQuality(Item item) {
        item.sellIn--;
        item.quality -= 2;
        return item.quality;
    }

    @Override
    public void addItem() {
        Item item[]={new Item("Conjured Item 1 ",8,12),
                new Item("Conjured Item 2 ",5,10),
                new Item("Conjured Item 3 ",15,30)};
        updateAndPrint(item);
    }

    public void updateAndPrint(Item[] item) {
        for (Item items : item) {
            updateQuality(items);
            System.out.println(items);
        }
    }


}

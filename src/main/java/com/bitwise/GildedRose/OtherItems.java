package com.bitwise.GildedRose;

/**
 * Created by Shubham on 24/07/2016.
 */
public class OtherItems implements UpdateQualityInterface {
    @Override
    public int updateQuality(Item item) {
        item.sellIn--;

        item.quality--;

        return item.quality;
    }

    @Override
    public void addItem() {
        Item item[]={new Item("Other Items Item 1 ",8,12),
                    new Item("Other Items Item 2 ",5,10),
                    new Item("Other Items Item 3 ",15,30)};
        updateAndPrint(item);
    }

    public void updateAndPrint(Item[] item) {
        for (Item items : item) {
            updateQuality(items);
            System.out.println(items);
        }
    }


}
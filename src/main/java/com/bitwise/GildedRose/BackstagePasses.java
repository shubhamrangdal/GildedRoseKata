package com.bitwise.GildedRose;

/**
 * Created by Shubham on 24/07/2016.
 */
public class BackstagePasses implements UpdateQualityInterface {
    @Override
    public int updateQuality(Item item) {

        if(item.sellIn <= 5)
             item.quality += 3;
        else if(item.sellIn<=10)
             item.quality +=2;
        else
             item.quality++;
        if(item.sellIn>50)
            item.quality=50;
        daysDecrement(item);
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
        Item item[]= new Item[]{new Item("Backstage Passes Item 1 ", 4, 20),
                new Item("Backstage Passes Item 2 ", 9, 30),
                new Item("Backstage Passes Item 3 ", 16, 40)};
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

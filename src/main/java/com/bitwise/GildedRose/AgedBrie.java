package com.bitwise.GildedRose;

/**
 * Created by Shubham on 24/07/2016.
 */
public class AgedBrie implements UpdateQualityInterface {

    public AgedBrie() {
    }

    @Override
    public int updateQuality(Item item) {
        daysDecrement(item);
        checkQuality(item);
        return item.quality;
    }

    private void daysDecrement(Item item) {
        if (item.sellIn >= 0)
            item.sellIn--;
        else {
            item.sellIn = 0;
            item.quality -= 2;
        }
    }

    private void checkQuality(Item item) {
        if (item.quality < 50)
            item.quality++;
        else
            throw new GildedRoseMainClass.QualityShouldNotBeGreaterThan50eException();
    }

    @Override
    public void addItem() {
        Item item[] = new Item[]{new Item("Aged Brie Item 1 ", 3, 2),
                new Item("Aged Brie Item 2 ", 2, 3),
                new Item("Aged Brie Item 3 ", 5, 4)};
        System.out.println("  Day 1  ");
        updateAndPrint(item);
    }

    public void updateAndPrint(Item[] item) {
        for (Item items : item) {
            updateQuality(items);
            System.out.println(items);
        }
    }


    public class QualityShouldNotBeDecreasesInAgedBrie extends RuntimeException {
    }
}

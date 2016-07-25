package com.bitwise.GildedRoseTest;

import com.bitwise.GildedRose.Item;
import com.bitwise.GildedRose.OtherItems;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shubham on 24/07/2016.
 */
public class OtherItemTesting  {
    @Test
    public  void  QualityShouldBeDecreasedBy1()
    {

            Item item=new Item("Other Items",5,50);
            OtherItems otherItems = new OtherItems();
            int i= otherItems.updateQuality(item);
            Assert.assertEquals(49,i);
    }

    @Test
    public  void  QualityShouldBeIncreases()
    {

        Item item=new Item("Other Items",5,50);
        OtherItems otherItems = new OtherItems();
        int i= otherItems.updateQuality(item);
        Assert.assertEquals(49,i);
    }
}

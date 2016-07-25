package com.bitwise.GildedRoseTest;

import com.bitwise.GildedRose.Item;
import com.bitwise.GildedRose.Sulfuras;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shubham on 24/07/2016.
 */
public class SulfurasTest {

    @Test
    public void qualityShouldBeSame()
    {
        Item item=new Item("Sulfuras",1,80);
        Sulfuras sulfuras= new Sulfuras();
        int i= sulfuras.updateQuality(item);
        Assert.assertEquals(80,i);
    }



    @Test
    public void itemNeverBeSold()
    {
        Item item=new Item("Sulfuras",0,79);
        Sulfuras sulfuras= new Sulfuras();
        int i= sulfuras.updateQuality(item);
        Assert.assertFalse(item.sellIn!=0);
    }

    @Test//(expected = Sulfuras.QualityMustBe80Exception.class)
    public void QualityMustBe80ForSulfuras()
    {
        Item item=new Item("Sulfuras",0,8);
        Sulfuras sulfuras= new Sulfuras();
        int i= sulfuras.updateQuality(item);
        Assert.assertFalse(item.quality==80);
    }
}

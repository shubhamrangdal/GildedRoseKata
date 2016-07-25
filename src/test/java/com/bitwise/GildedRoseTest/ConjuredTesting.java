package com.bitwise.GildedRoseTest;

import com.bitwise.GildedRose.Conjured;
import com.bitwise.GildedRose.Item;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shubham on 24/07/2016.
 */
public class ConjuredTesting {

    @Test
    public void qualityShouldDecreasesBy2()
    {
        //given
        Item item=new Item("Sulfuras",1,80);
        Conjured conjured= new Conjured();
        //when
        int i= conjured.updateQuality(item);
        //then
        Assert.assertEquals(78,i);
    }

    @Test
    public void qualityShouldNotBeDecreasesBy1()
    {
        //given
        Item item=new Item("Sulfuras",1,65);
        Conjured conjured= new Conjured();
        //when
        int i= conjured.updateQuality(item);
        //then
        Assert.assertFalse(item.quality==76);
    }
}

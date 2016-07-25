package com.bitwise.GildedRoseTest;

import com.bitwise.GildedRose.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shubham on 24/07/2016.
 */
public class AgedBriesTest {
    @Test
    public void itShouldIncreaseTheQuality()
    {
        //given
        Item item=new Item("Aged Brie",4,1);
        AgedBrie agedBrie=new AgedBrie();
        //when
        int i= agedBrie.updateQuality(item);
        //then
        Assert.assertEquals(2,i);
    }

    @Test//(expected = AgedBrie.QualityShouldNotBeDecreasesInAgedBrie.class)
    public void itShouldNotDecreaseTheQuality()
    {
        //given
        Item item=new Item("Aged Brie",9,5);
        AgedBrie agedBrie=new AgedBrie();
        //when
        int i= agedBrie.updateQuality(item);
        //then
        Assert.assertFalse(item.quality==4);
    }

    @Test(expected= GildedRoseMainClass.QualityShouldNotBeGreaterThan50eException.class)
    public void QualityShouldNotBeGreaterThan50()
    {
        //given
        Item item=new Item("Aged Brie",9,51);
        AgedBrie agedBrie=new AgedBrie();
        //when
        int i= agedBrie.updateQuality(item);
        //then
    }
}

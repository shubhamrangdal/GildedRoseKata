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
        Item item=new Item("Aged Brie",4,1);
        AgedBrie agedBrie=new AgedBrie();
        int i= agedBrie.updateQuality(item);
        Assert.assertEquals(2,i);
    }

    @Test//(expected = AgedBrie.QualityShouldNotBeDecreasesInAgedBrie.class)
    public void itShouldNotDecreaseTheQuality()
    {
        Item item=new Item("Aged Brie",9,5);
        AgedBrie agedBrie=new AgedBrie();
        int i= agedBrie.updateQuality(item);
        Assert.assertFalse(item.quality==4);
    }


}

package com.bitwise.GildedRoseTest;

import com.bitwise.GildedRose.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shubham on 24/07/2016.
 */
public class BackstagePassesTest {
    @Test
    public void QualityShouldBeDecreasedBy1()
    {
        Item item=new Item("BackstagePasses",17,50);
        BackstagePasses backstagePasses = new BackstagePasses();
        int i= backstagePasses.updateQuality(item);
        Assert.assertEquals(49,i);
    }

    @Test
    public void itShouldDecreaseQualityBy3IfSellInisLessThan5()
    {
        Item item=new Item("BackstagePasses",5,50);
        BackstagePasses backstagePasses = new BackstagePasses();
        int i= backstagePasses.updateQuality(item);
        Assert.assertEquals(47,i);
    }

    @Test
    public void itShouldDecreaseQualityBy2IfSellInisLessThan10()
    {
        Item item=new Item("BackstagePasses",8,50);
        BackstagePasses backstagePasses = new BackstagePasses();
        int i= backstagePasses.updateQuality(item);
        Assert.assertEquals(48,i);
    }
}

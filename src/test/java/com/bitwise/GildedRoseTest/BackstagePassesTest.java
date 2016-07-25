package com.bitwise.GildedRoseTest;

import com.bitwise.GildedRose.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shubham on 24/07/2016.
 */
public class BackstagePassesTest {
    @Test
    public void QualityShouldBeIncreasedBy1()
    {
        //given
        Item item=new Item("BackstagePasses",17,23);
        BackstagePasses backstagePasses = new BackstagePasses();
        //when
        int i= backstagePasses.updateQuality(item);
        //then
        Assert.assertEquals(24,i);
    }

    @Test
    public void itShouldINcreaseQualityBy3IfSellInisLessThan5()
    {
        //given
        Item item=new Item("BackstagePasses",5,34);
        BackstagePasses backstagePasses = new BackstagePasses();
        //when
        int i= backstagePasses.updateQuality(item);
        //then
        Assert.assertEquals(37,i);
    }

    @Test
    public void itShouldDecreaseQualityBy2IfSellInisLessThan10()
    {
        //given
        Item item=new Item("BackstagePasses",8,23);
        BackstagePasses backstagePasses = new BackstagePasses();
        //when
        int i= backstagePasses.updateQuality(item);
        //then
        Assert.assertEquals(25,i);
    }
}

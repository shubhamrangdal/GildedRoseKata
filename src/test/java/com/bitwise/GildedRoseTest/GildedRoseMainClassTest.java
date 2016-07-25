package com.bitwise.GildedRoseTest;

import com.bitwise.GildedRose.GildedRoseMainClass;
import org.junit.Test;

/**
 * Created by Shubham on 23/07/2016.
 */
public class GildedRoseMainClassTest {
    @Test(expected= GildedRoseMainClass.QualityShouldNotBeNegativeException.class)
    public void QualityShouldNotBeNegative(){
        //given
        GildedRoseMainClass qualityobj=new GildedRoseMainClass();
        //when
        qualityobj.noNegativeNoAccepted(-1);
        //then
    }

    @Test(expected= GildedRoseMainClass.QualityShouldNotBeGreaterThan50eException.class)
    public void QualityShouldNotBeGreaterThan50(){
        //given
        GildedRoseMainClass gildedRoseMainClassObj =new GildedRoseMainClass();
        //when
        gildedRoseMainClassObj.noNegativeNoAccepted(53);
        //then
    }



}
package com.bitwise.GildedRoseTest;

import com.bitwise.GildedRose.Quality;
import org.junit.Test;

/**
 * Created by Shubham on 23/07/2016.
 */
public class QualityTest {
    @Test(expected= Quality.QualityShouldNotBeNegativeException.class)
    public void QualityShouldNotBeNegative(){
        //given
        Quality qualityobj=new Quality();
        //when
        qualityobj.noNegativeNoAccepted(-1);
        //then
    }

    @Test(expected= Quality.QualityShouldNotBeGreaterThan50eException.class)
    public void QualityShouldNotBeGreaterThan50(){
        //given
        Quality qualityObj=new Quality();
        //when
        qualityObj.noNegativeNoAccepted(53);
        //then
    }



}
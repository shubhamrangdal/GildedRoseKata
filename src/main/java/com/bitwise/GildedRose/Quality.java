package com.bitwise.GildedRose;

/**
 * Created by Shubham on 23/07/2016.
 */
public class Quality {
    public static int SellIn;
    public static int quality;

    public void noNegativeNoAccepted(int i) {
        if(i<0)
            throw new QualityShouldNotBeNegativeException();
        if(i>50)
            throw new QualityShouldNotBeGreaterThan50eException();
    }

    public class QualityShouldNotBeNegativeException  extends RuntimeException{
    }

    public class QualityShouldNotBeGreaterThan50eException extends RuntimeException{
    }
    public static void main(String []args) {
        FactoryQuality factoryQuality=new FactoryQuality();
        factoryQuality.factoryMethod(ItemsEnum.AgedBrie);
        factoryQuality.factoryMethod(ItemsEnum.BackstagePasses);
        factoryQuality.factoryMethod(ItemsEnum.Sulfuras);
        factoryQuality.factoryMethod(ItemsEnum.OtherItems);
        factoryQuality.factoryMethod(ItemsEnum.Conjured);

    }

}

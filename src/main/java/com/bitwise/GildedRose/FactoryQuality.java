package com.bitwise.GildedRose;

/**
 * Created by Shubham on 24/07/2016.
 */
public class FactoryQuality {

    public void factoryMethod(ItemsEnum var) {
        createAgedBrieInstance(var);
        createBackstagePassesInstance(var);
        createSulfurasInstance(var);
        createOtherItemsInstance(var);
        createConjuredInstance(var);
    }

    private void createOtherItemsInstance(ItemsEnum var) {
        if(ItemsEnum.OtherItems==var)
            new OtherItems().addItem();
    }

    private void createConjuredInstance(ItemsEnum var) {
        if(ItemsEnum.Conjured==var)
            new OtherItems().addItem();
    }
    private void createSulfurasInstance(ItemsEnum var) {
        if(ItemsEnum.Sulfuras==var)
            new Sulfuras().addItem();
    }

    private void createBackstagePassesInstance(ItemsEnum var) {
        if(ItemsEnum.BackstagePasses==var)
            new BackstagePasses().addItem();
    }

    private void createAgedBrieInstance(ItemsEnum var) {
        if(ItemsEnum.AgedBrie==var)
            new AgedBrie().addItem();
    }
}

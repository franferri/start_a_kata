package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemGeneric extends ItemType {

    @Override
    public void updateQuality(Item item) {

        item.sellIn -= 1;
        isExpired = item.sellIn < 0;

        decrementQualityByOne(item);
        if (isExpired) {
            decrementQualityByOne(item);
        }

    }

}

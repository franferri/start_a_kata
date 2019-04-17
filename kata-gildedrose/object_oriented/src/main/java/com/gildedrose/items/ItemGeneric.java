package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemGeneric extends ItemType {

    @Override
    public void updateQuality(Item item) {

        oneDayPass(item);

        decrementQualityByOne(item);
        if (isExpired(item)) {
            decrementQualityByOne(item);
        }

    }

}

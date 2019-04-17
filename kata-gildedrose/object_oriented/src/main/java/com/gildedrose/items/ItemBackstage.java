package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemBackstage extends ItemType {

    @Override
    public void updateQuality(Item item) {

        int previousSellIn = item.sellIn;

        oneDayPass(item);

        incrementQualityByOne(item);
        if (previousSellIn < 11) {
            incrementQualityByOne(item);
        }
        if (previousSellIn < 6) {
            incrementQualityByOne(item);
        }
        if (isExpired(item)) {
            item.quality = 0;
        }

    }
}

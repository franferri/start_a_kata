package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemBackstage extends ItemType {

    @Override
    public void updateQuality(Item item) {

        int previousSellIn = item.sellIn;

        oneDayCloseToExpire(item);

        qualityChangesBy(item, +1);
        if (previousSellIn < 11) {
            qualityChangesBy(item, +1);
        }
        if (previousSellIn < 6) {
            qualityChangesBy(item, +1);
        }
        if (isExpired(item)) {
            item.quality = 0;
        }

    }
}

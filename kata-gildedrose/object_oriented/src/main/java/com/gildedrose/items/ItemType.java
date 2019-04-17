package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class ItemType {

    public abstract void updateQuality(Item item);

    protected void oneDayPass(Item item) {
        item.sellIn -= 1;
    }

    protected boolean isExpired(Item item) {
        return item.sellIn < 0;
    }

    protected void decrementQualityByOne(Item item) {
        item.quality -= 1;
        ensureEdgeCases(item);
    }

    protected void incrementQualityByOne(Item item) {
        item.quality += 1;
        ensureEdgeCases(item);
    }

    private void ensureEdgeCases(Item item) {
        if (item.quality > 50) {
            item.quality = 50;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }

}

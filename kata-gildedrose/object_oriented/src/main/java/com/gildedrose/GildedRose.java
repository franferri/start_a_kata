package com.gildedrose;

import com.gildedrose.items.ItemType;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemType.builder(item).updateQuality(item);
        }
    }

}
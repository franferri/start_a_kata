package com.gildedrose;

import java.util.Arrays;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        Arrays.stream(items)
                .filter(x -> !x.name.equals("Sulfuras, Hand of Ragnaros"))
                .forEach(item -> {

                    int previousSellIn = item.sellIn;
                    oneDayCloseToExpire(item);

                    boolean isBackstage = item.name.endsWith("Backstage passes to a TAFKAL80ETC concert");
                    boolean isAgedBrie = item.name.endsWith("Aged Brie");
                    boolean isConjured = item.name.startsWith("Conjured");
                    boolean isGeneric = !isBackstage && !isAgedBrie && !isConjured;
                    boolean isExpired = item.sellIn < 0;

                    if (isAgedBrie) {

                        qualityChangesBy(item, +1);

                        if (isExpired) qualityChangesBy(item, +1);

                    }

                    if (isBackstage) {

                        qualityChangesBy(item, +1);

                        if (previousSellIn <= 10) qualityChangesBy(item, +1);

                        if (previousSellIn <= 5) qualityChangesBy(item, +1);

                        if (isExpired) item.quality = 0;

                    }

                    if (isGeneric) {

                        qualityChangesBy(item, -1);

                        if (isExpired) qualityChangesBy(item, -1);

                    }

                    if (isConjured) {

                        qualityChangesBy(item, -2);

                        if (isExpired) qualityChangesBy(item, -2);

                    }

                });
    }

    private void oneDayCloseToExpire(Item item) {

        item.sellIn -= 1;

    }

    private void qualityChangesBy(Item item, int quality) {

        item.quality += quality;

        if (item.quality > 50) {
            item.quality = 50;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }

    }

}
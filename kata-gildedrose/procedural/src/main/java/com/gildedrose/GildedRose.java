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
                    item.sellIn -= 1;

                    boolean isBackstage = item.name.equals("Backstage passes to a TAFKAL80ETC concert");
                    boolean isAgedBrie = item.name.equals("Aged Brie");
                    boolean isGeneric = !isBackstage && !isAgedBrie;
                    boolean isExpired = item.sellIn < 0;

                    if (isAgedBrie) {

                        incrementQualityByOne(item);
                        if (isExpired) {
                            incrementQualityByOne(item);
                        }

                    }

                    if (isBackstage) {

                        incrementQualityByOne(item);

                        if (previousSellIn <= 10) {
                            incrementQualityByOne(item);

                        }
                        if (previousSellIn <= 5) {
                            incrementQualityByOne(item);
                        }

                        if (isExpired) {
                            item.quality = 0;
                        }

                    }

                    if (isGeneric) {

                        decrementQualityByOne(item);
                        if (isExpired) {
                            decrementQualityByOne(item);
                        }

                    }

                });
    }

    private void decrementQualityByOne(Item item) {
        item.quality -= 1;
        ensureEdgeCases(item);
    }

    private void incrementQualityByOne(Item item) {
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
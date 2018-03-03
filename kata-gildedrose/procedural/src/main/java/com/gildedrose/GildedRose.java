package com.gildedrose;

import java.util.Arrays;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {

		Item[] reducedItems = Arrays.stream(items).filter(x -> !x.name.equals("Sulfuras, Hand of Ragnaros")).toArray(Item[]::new);

		for (int i = 0; i < reducedItems.length; i++) {

			int previousSellIn = items[i].sellIn;
			items[i].sellIn -= 1;

			boolean isBackstage = items[i].name.equals("Backstage passes to a TAFKAL80ETC concert");
			boolean isAgedBrie = items[i].name.equals("Aged Brie");
			boolean isGeneric = !isBackstage && !isAgedBrie;
			boolean qualityLowerThanFifty = items[i].quality < 50;
			boolean isExpired = items[i].sellIn < 0;

			if (isAgedBrie && qualityLowerThanFifty) {
				incrementQualityByOne(i);
				if (isExpired) {
					incrementQualityByOne(i);
				}
			}

			if (isBackstage && qualityLowerThanFifty) {

				incrementQualityByOne(i);

				if (previousSellIn < 11) {
					incrementQualityByOne(i);

				}
				if (previousSellIn < 6) {
					incrementQualityByOne(i);
				}

				if (isExpired) {
					items[i].quality = 0;
				}

			}

			if (isGeneric && items[i].quality > 0) {
				decrementQualityByOne(i);
				if (isExpired) {
					decrementQualityByOne(i);
				}

			}

		}
	}

	private void decrementQualityByOne(int i) {
		items[i].quality = items[i].quality - 1;
	}

	private void incrementQualityByOne(int i) {
		items[i].quality = items[i].quality + 1;
	}
}
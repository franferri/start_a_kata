package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemBackstage extends ItemType {

	public ItemBackstage(Item item) {
		super(item);
	}

	@Override
	public Item updateQuality() {

		int previousSellIn = sellIn;
		sellIn -= 1;
		isExpired = sellIn < 0;

		if (qualityLowerThanFifty) {
			incrementQualityByOne();
			if (previousSellIn < 11) {
				incrementQualityByOne();
			}
			if (previousSellIn < 6) {
				incrementQualityByOne();
			}
			if (isExpired) {
				quality = 0;
			}
		}

		return this;

	}
}

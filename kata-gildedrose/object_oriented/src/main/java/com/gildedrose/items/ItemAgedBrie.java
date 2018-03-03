package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemAgedBrie extends ItemType {

	public ItemAgedBrie(Item item) {
		super(item);
	}

	@Override
	public Item updateQuality() {

		sellIn -= 1;
		isExpired = sellIn < 0;

		if (qualityLowerThanFifty) {
			incrementQualityByOne();
			if (isExpired) {
				incrementQualityByOne();
			}
		}

		return this;

	}

}

package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemAgedBrie extends ItemType {

	@Override
	public void updateQuality(Item item) {

		item.sellIn -= 1;
		isExpired = item.sellIn < 0;

		incrementQualityByOne(item);
		if (isExpired) {
			incrementQualityByOne(item);
		}

	}

}

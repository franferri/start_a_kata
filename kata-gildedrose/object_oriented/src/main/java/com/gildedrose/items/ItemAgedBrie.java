package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemAgedBrie extends ItemType {

	@Override
	public void updateQuality(Item item) {

		oneDayPass(item);

		incrementQualityByOne(item);
		if (isExpired(item)) {
			incrementQualityByOne(item);
		}

	}

}

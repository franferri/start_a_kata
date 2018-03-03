package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemGeneric extends ItemType {

	public ItemGeneric(Item item) {
		super(item);
	}

	@Override
	public Item updateQuality() {

		sellIn -= 1;
		isExpired = sellIn < 0;

		if (quality > 0) {
			decrementQualityByOne();
			if (isExpired) {
				decrementQualityByOne();
			}
		}

		return this;

	}

}

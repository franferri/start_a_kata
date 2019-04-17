package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class ItemType {

	boolean isExpired;

	public abstract void updateQuality(Item item);

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

	public static <T extends ItemType> ItemType builder(Item item) {

		if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new ItemBackstage();
		} else if (item.name.equals("Aged Brie")) {
			return new ItemAgedBrie();
		} else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			return new ItemSulfuras();
		} else {
			return new ItemGeneric();
		}

	}

}

package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class ItemType extends Item {

	boolean qualityLowerThanFifty = quality < 50;
	boolean isExpired;

	public ItemType(Item item) {
		super(item.name, item.sellIn, item.quality);
	}

	public abstract Item updateQuality();

	void decrementQualityByOne() {
		quality = quality - 1;
	}

	void incrementQualityByOne() {
		quality = quality + 1;
	}

	public static <T extends ItemType> ItemType builder(Item item) {

		if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new ItemBackstage(item);
		} else if (item.name.equals("Aged Brie")) {
			return new ItemAgedBrie(item);
		} else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
			return new ItemSulfuras(item);
		} else {
			return new ItemGeneric(item);
		}

	}

}

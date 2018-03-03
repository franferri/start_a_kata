package com.gildedrose.items;

import com.gildedrose.Item;

public class ItemSulfuras extends ItemType {

	public ItemSulfuras(Item item) {
		super(item);
	}

	@Override
	public Item updateQuality() {
		return this;
	}

}

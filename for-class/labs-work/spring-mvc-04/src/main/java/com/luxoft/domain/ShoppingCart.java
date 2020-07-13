package com.luxoft.domain;

import java.util.ArrayList;
import java.util.List;

// TODO: add required annotations here
public class ShoppingCart {
    private final List<Item> orderedItems = new ArrayList<>();

    public List<Item> getOrderedItems() {
        return orderedItems;
    }

    public void add(Item item) {
        orderedItems.add(item);
    }

    public void clear() {
        orderedItems.clear();
    }
}

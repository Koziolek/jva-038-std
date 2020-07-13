package com.luxoft.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemsServiceImpl.class);

    private static final List<Item> AVAILABLE_ITEMS = new ArrayList<>();

    static {
        AVAILABLE_ITEMS.add(new Item(1, "Overdraft Card", 500));
        AVAILABLE_ITEMS.add(new Item(2, "Credit Account", 100));
        AVAILABLE_ITEMS.add(new Item(3, "Private Safe Box", 300));
    }

    @Override
    public List<Item> getAvailableItems() {
        return AVAILABLE_ITEMS;
    }

    @Override
    public Item get(int id) {
        for (Item item : AVAILABLE_ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return AVAILABLE_ITEMS.get(0);
    }

    @Override
    public void order(List<Item> items) {
        StringBuilder sb = new StringBuilder()
            .append("You ordered following items:")
            .append('\n');
        for (Item item : items) {
            sb.append(item.toString());
            sb.append('\n');
        }
        LOGGER.error(sb.toString());
    }
}

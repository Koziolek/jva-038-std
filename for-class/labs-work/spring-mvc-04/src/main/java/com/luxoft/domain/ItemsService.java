package com.luxoft.domain;

import java.util.List;

public interface ItemsService {

    List<Item> getAvailableItems();

    Item get(int id);

    void order(List<Item> items);
}

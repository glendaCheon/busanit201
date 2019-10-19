package com.hacheon.todosample.logic;

import com.hacheon.todosample.model.Item;

public interface WriteDataSource {
    void setWriteRepository(WriteRepository repository);
    void save(Item item);
    void fetchItems();
}

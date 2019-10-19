package com.hacheon.todosample.logic.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.hacheon.todosample.model.Item;

import java.util.List;

@Dao
public interface ItemDao {
    @Query("SELECT * FROM ITEM")
    List<Item> fetchItems();
    @Insert
    void saveItem(Item item);
}


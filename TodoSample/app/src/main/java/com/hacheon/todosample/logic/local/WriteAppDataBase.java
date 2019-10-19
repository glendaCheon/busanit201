package com.hacheon.todosample.logic.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.hacheon.todosample.model.Item;
import com.hacheon.todosample.model.User;

@Database(entities = {Item.class}, version = 2)
public abstract class WriteAppDataBase extends RoomDatabase {
    public abstract  ItemDao getitemDao();
}

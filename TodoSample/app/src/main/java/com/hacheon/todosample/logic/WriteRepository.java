package com.hacheon.todosample.logic;

import com.hacheon.todosample.base.BasePresenter;
import com.hacheon.todosample.login.LoginContract;
import com.hacheon.todosample.model.Item;
import com.hacheon.todosample.model.User;
import com.hacheon.todosample.write.WriteContract;

import java.util.List;

public interface WriteRepository<T> {
    void setPresenter(BasePresenter<T> presenter);

    //[START] SAVE
    void save(Item item);
    void saveDone();
    //[END] SAVE

    //[START] FETCH
    void fetchItems();
    void fetchItemsDone(List<Item> items);
    //[END]
}

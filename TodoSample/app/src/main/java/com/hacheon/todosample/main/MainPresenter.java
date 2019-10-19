package com.hacheon.todosample.main;

import com.hacheon.todosample.base.BasePresenterImpl;
import com.hacheon.todosample.logic.WriteRepository;
import com.hacheon.todosample.logic.WriteRepositoryImpl;

import java.util.List;

public class MainPresenter extends BasePresenterImpl<MainContract.View> implements  MainContract.Presenter{
    WriteRepository repository;
    MainPresenter() {
        this.repository = new WriteRepositoryImpl();
        this.repository.setPresenter(this);
    }

    @Override
    public void fetchItemsDone(List list) {
        this.repository.fetchItemsDone(list);
    }

    @Override
    public void fetchItems() {
        this.repository.fetchItems();
    }

    @Override
    public void showDetail(int no) {
        view.showDetail(no);
    }
}

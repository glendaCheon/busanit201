package com.hacheon.todosample.logic;

import com.hacheon.todosample.base.BasePresenter;
import com.hacheon.todosample.logic.local.WriteLocalDataSourceImpl;
import com.hacheon.todosample.login.LoginContract;
import com.hacheon.todosample.main.MainContract;
import com.hacheon.todosample.model.Item;
import com.hacheon.todosample.write.WriteContract;

import java.util.List;

import javax.sql.DataSource;

public class WriteRepositoryImpl<T> implements WriteRepository {

    BasePresenter<T> presenter;
    WriteDataSource localDataSource;
    WriteDataSource remoteDataSource;

    @Override
    public void setPresenter(BasePresenter presenter) {
        this.presenter = presenter;
        localDataSource = new WriteLocalDataSourceImpl();
        remoteDataSource = new WriteLocalDataSourceImpl();
        localDataSource.setWriteRepository(this);
        remoteDataSource.setWriteRepository(this);
    }

    @Override
    public void save(Item item) {
        localDataSource.save(item);
    }

    @Override
    public void saveDone() {
        ((WriteContract.Presenter)presenter).saveDone();
    }

    @Override
    public void fetchItems() {
        localDataSource.fetchItems();
    }

    @Override
    public void fetchItemsDone(List list) {
        ((MainContract.Presenter)presenter).fetchItemsDone(list);
    }
}

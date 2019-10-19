package com.hacheon.todosample.main;

import com.hacheon.todosample.base.BasePresenter;
import com.hacheon.todosample.base.BaseView;
import com.hacheon.todosample.model.Item;

import java.util.List;

public class MainContract {
    public interface  View extends BaseView {
//        void saveDone();
        void showDetail(int no);
    }

    public interface Presenter extends BasePresenter<MainContract.View> {
        void fetchItemsDone(List list);
        void fetchItems();
        void showDetail(int no);
    }
}

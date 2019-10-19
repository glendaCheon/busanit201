package com.hacheon.todosample.write;

import com.hacheon.todosample.base.BasePresenter;
import com.hacheon.todosample.base.BaseView;
import com.hacheon.todosample.model.Item;
import com.hacheon.todosample.model.User;

public class WriteContract {
    public interface  View extends BaseView {
        void saveDone();
    }

    public interface Presenter extends BasePresenter<WriteContract.View> {
        void save(Item item);
        void saveDone();
    }
}

package com.hacheon.todosample.view;

import android.os.Bundle;

import com.hacheon.todosample.R;
import com.hacheon.todosample.base.BaseActivity;
import com.hacheon.todosample.main.MainContract;

public class MainActivity extends BaseActivity<MainContract.View, MainContract.Presenter> implements MainContract.View {
//    MainAdaptor mainAdapter;

    @Override
    public void showDetail(int no) {

    }

    @Override
    protected MainContract.Presenter setPresenter() {
        return null;
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

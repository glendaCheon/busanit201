package com.hacheon.todosample.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hacheon.todosample.R;
import com.hacheon.todosample.base.BaseActivity;
import com.hacheon.todosample.write.WriteContract;

public class WriteActivity extends BaseActivity<WriteContract.View, WriteContract.Presenter> implements WriteContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
    }

    public WriteContract.Presenter setPresenter() {
        return null;
    }


    @Override
    public void saveDone() {

    }
}

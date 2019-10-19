package com.hacheon.todosample.view;

import android.content.Intent;
import android.os.Bundle;

import com.hacheon.todosample.R;
import com.hacheon.todosample.base.BaseActivity;
import com.hacheon.todosample.login.LoginContract;
import com.hacheon.todosample.login.LoginPresenter;
import com.hacheon.todosample.model.Item;
import com.hacheon.todosample.model.User;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class LoginActivity extends BaseActivity<LoginContract.View, LoginContract.Presenter> implements LoginContract.View {

    @Override
    protected LoginContract.Presenter setPresenter() {
        return new LoginPresenter();
    }

    //[START] components area
    @BindView(R.id.txtId)
    EditText txtId;
    @BindView(R.id.txtPwd)
    EditText txtPwd;
    @BindView(R.id.btnLogin)
    Button btnLogin;
//    @BindView(R.id.mainRecylerView)
//    RecyclerView recyclerView;
    //[END] COMPONENTS

    //[START] FIELDS
    private LoginContract.Presenter loginPresenter;
    private static int _REUQEST_ADD_DATA = 100;
    List<Item> items;
    //[END]


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loginPresenter = new LoginPresenter();
        loginPresenter.setView(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Observable.just("click")
                        .subscribeOn(AndroidSchedulers.mainThread())
                        .observeOn(Schedulers.io())
                        .doOnNext(new Consumer<String>() {
                            @Override
                            public void accept(String s) throws Exception {
                                User user = new User();
                                user.setId(txtId.getText().toString());
                                user.setPwd(txtPwd.getText().toString());
                                loginPresenter.loginProc(user);
                                loginPresenter.loginDone();
                            }
                        });
            }
        });
    }

    @Override
    public void loginDone() {

        Toast.makeText(this, "loginDone!",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(LoginActivity.this, WriteActivity.class);
//        startActivityForResult(intent, _REUQEST_ADD_DATA);

//        items = new ArrayList<>();
//        initRecyclerView();
    }

//    private void initRecyclerView() {
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutFrozen(linearLayoutManager);
//        mainAdaptor = new MainAdaptor()
//        recyclerView.setAdapter(mainAdaptor);
//    }

    @Override
    protected void onDestroy() {
        loginPresenter.removeView();
        super.onDestroy();
    }
}

package com.zhu.android.seekphoto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 登录Activity
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText accountEditxt;     //用户名输入框
    private EditText passwordEditxt;    //密码输入框
    private Button loginButton;         //登录按钮
    private TextView regTxt;            //注册
    private TextView findPwdTxt;        //找回密码

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    /**
     * 控件初始化
     */
    private void init() {
        // TODO: 2017/11/4  控件初始化
        accountEditxt = (EditText) findViewById(R.id.login_editxt_account);
        passwordEditxt = (EditText) findViewById(R.id.login_ecitxt_pwd);
        loginButton = (Button) findViewById(R.id.login_login_btn);
        regTxt = (TextView) findViewById(R.id.login_reg);
        findPwdTxt = (TextView) findViewById(R.id.login_findpwd);

        accountEditxt.setOnClickListener(this);
        passwordEditxt.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        regTxt.setOnClickListener(this);
        findPwdTxt.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //登录
            case R.id.login_login_btn:
                String account = accountEditxt.getText().toString();
                String password = passwordEditxt.getText().toString();
                doLogin(account,password);
                break;

            //注册
            case R.id.login_reg:
                doReg();
                break;

            //找回密码
            case R.id.login_findpwd:
                doFindPwd();
                break;
        }
    }

    /**
     * 找回密码事件
     */
    private void doFindPwd() {
        // TODO: 2017/11/4  找回密码
        Intent findpwdIntent = new Intent(this,FindpwdActivity.class);
        startActivity(findpwdIntent);
    }

    /**
     * 注册事件
     */
    private void doReg() {
        // TODO: 2017/11/4  注册
        Intent regIntent = new Intent(this,RegActivity.class);
        startActivity(regIntent);
    }

    /**
     * 登录事件
     * @param account   用户名
     * @param password  密码
     */
    private void doLogin(String account, String password) {
        // TODO: 2017/11/4  登录
        if(true){
            startActivity(new Intent(this,FindpwdActivity.class));
            finish();
        }
    }
}

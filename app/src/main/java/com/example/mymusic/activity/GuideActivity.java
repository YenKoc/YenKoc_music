package com.example.mymusic.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mymusic.R;

public class GuideActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt_login_or_register;
    private Button bt_enter;
    private static final String TAG="GuideActivity";
    /**
     * 当界面创建时，回调该函数
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        //隐藏状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //找控件
        //登陆注册按钮
        bt_login_or_register=findViewById(R.id.bt_login_or_register);
        //立即体验按钮
        bt_enter = findViewById(R.id.bt_enter);
        //设置点击事件
        bt_login_or_register.setOnClickListener(this);
        //立即体验按钮
        bt_enter.setOnClickListener(this);
    }

    /**
     * 点击回调
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_login_or_register:
                //登陆按钮点击
                Log.d(TAG, "onClick: login or register");
                break;
            case R.id.bt_enter:
                //立即体验按钮点击
                Log.d(TAG, "onClick: enter");
                break;
        }

    }
}

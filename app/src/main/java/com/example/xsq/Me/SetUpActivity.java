package com.example.xsq.Me;

/**
 * 设置页面
 */

import android.os.Bundle;
import android.view.Window;

import com.example.R;
import com.example.xsq.util.BaseActivity;

public class SetUpActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_set_up);

    }
}

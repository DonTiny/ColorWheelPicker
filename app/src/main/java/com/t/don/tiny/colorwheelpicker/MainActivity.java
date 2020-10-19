package com.t.don.tiny.colorwheelpicker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private com.t.don.tiny.colorwheelpicker.view.ColorPickerView mColorPickerView;
    private TextView mTv_color_1;
    private TextView mTv_color_2;
    private TextView mTv_color_3;
    private TextView mTv_color_4;
    private String[] colors = {"#EEDC82", "#E066FF", "#7FFFD4", "#63B8FF"};
    //private int[] colors = {#FFFF00","#FF00FF","#7CFC00","#63B8FF"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
       // initData();
    }

    private void initData() {
        mTv_color_1.setText(colors[0]);
        mTv_color_2.setText(colors[1]);
        mTv_color_3.setText(colors[2]);
        mTv_color_4.setText(colors[3]);

        mTv_color_1.setBackgroundColor(Color.parseColor(colors[0]));
        mTv_color_2.setBackgroundColor(Color.parseColor(colors[1]));
        mTv_color_3.setBackgroundColor(Color.parseColor(colors[2]));
        mTv_color_4.setBackgroundColor(Color.parseColor(colors[3]));


    }

    private void initListener() {
        mTv_color_1.setOnClickListener(this);
        mTv_color_2.setOnClickListener(this);
        mTv_color_3.setOnClickListener(this);
        mTv_color_4.setOnClickListener(this);
    }

    private void initView() {
        mColorPickerView = (com.t.don.tiny.colorwheelpicker.view.ColorPickerView) findViewById(R.id.colorPickerView);
        mTv_color_1 = (TextView) findViewById(R.id.tv_color_1);
        mTv_color_2 = (TextView) findViewById(R.id.tv_color_2);
        mTv_color_3 = (TextView) findViewById(R.id.tv_color_3);
        mTv_color_4 = (TextView) findViewById(R.id.tv_color_4);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.tv_color_1:
                mColorPickerView.setColor(Color.parseColor(colors[0]));
                break;
            case R.id.tv_color_2:
                mColorPickerView.setColor(Color.parseColor(colors[1]));
                break;
            case R.id.tv_color_3:
                mColorPickerView.setColor(Color.parseColor(colors[2]));
                break;
            case R.id.tv_color_4:
                mColorPickerView.setColor(Color.parseColor(colors[3]));
                break;

        }
    }
}

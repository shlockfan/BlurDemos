package com.app.fan.blurdemos;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.blurry.Blurry;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.im_rl)
    RelativeLayout im_rl;

    @Bind(R.id.btn)
    Button btn;

    private boolean isBlur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn)
    void toBlur() {
        Blurry.with(this)
                .radius(10)
                .sampling(8)
                .color(Color.argb(0, 0, 0, 0))
                .async()
                .animate(500)
                .onto(im_rl);
    }
}

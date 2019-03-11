package com.guiyunli.rxjava;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * @Author Li Gui Yun
 * @date 2019年02月21日16:24
 * @email guiyun.li@aihuishou.com
 **/
public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btn_transfer = findViewById(R.id.btn_transfer);

        Button btn_quit = findViewById(R.id.btn_quit);
        btn_transfer.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                setResult(0);
                                            }
                                        }
        );
        btn_quit.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                        }
                                    }
        );
    }
}

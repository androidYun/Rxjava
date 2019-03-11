package com.guiyunli.rxjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;


/**
 * @Author Li Gui Yun
 * @date 2019年02月21日16:23
 * @email guiyun.li@aihuishou.com
 **/
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn_transfer = findViewById(R.id.btn_transfer);

        Button btn_quit = findViewById(R.id.btn_quit);
        btn_transfer.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                startActivityForResult(new Intent(SecondActivity.this, ThirdActivity.class), 0);
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
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("B收到没Log"+SecondActivity.class.getSimpleName(),"B收到没");
        finish();
    }
}

package com.guiyunli.rxjava;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bumptech.glide.Glide;

import org.greenrobot.eventbus.EventBus;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_transfer = findViewById(R.id.btn_transfer);

        Button btn_quit = findViewById(R.id.btn_quit);
        btn_transfer.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                EventBus.getDefault().register(this);
                                            }
                                        }
        );
        btn_quit.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                        }
                                    }
        );
        String status = "";
        new String("ab1");

        if (status.equals("快递")) {
            packageExpressDelivery();
            calculateAmountExpressDelivery();
        } else if (status.equals("物流")) {
            packageLogistics();
            calculateLogisticsAmount();
        }
    }


    class ProxySellFisher implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return null;
        }
    }

    /**
     * 打包物流
     */
    private void packageLogistics() {

    }

    /**
     * 计算费用
     */
    private double calculateLogisticsAmount() {
        return 0;
    }

    /**
     * 打包快递
     */
    private void packageExpressDelivery() {

    }

    /**
     * 计算快递费用
     */
    private double calculateAmountExpressDelivery() {
        return 0;
    }


    class s extends AsyncTask<String, Void, Bitmap> {
        public s() {
            super();
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            return null;
        }
    }

    /**
     * 冒泡排序就是 让数组的第一位 到最后一位  一次类推进行对比 如果第N个数字i给后面数字j进行对比 如果i>j i和j就行交换为位置
     * 以此类推 循环次数是 f(n)=0+1+2+3..+n  如果数字为100W 用这种方式将是灾难
     */
    private void bubbleSort() {
        int[] numbers = {0, 5, 1, 6, 7, 87, 6, 8, 1, 4};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] >= numbers[j]) {
                    int flag = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = flag;
                }
            }
        }
        for (int number : numbers) {
            System.out.println("数字" + number);
        }
    }

    /**
     * 选择排序  根据 0..n进行数字比对，找到最小的那个数字 给第一个进行比对，最小的数字不是当前位置的数字，就进行交换数字 以此类推
     */
    private void selectSort() {
        int[] numbers = {0, 5, 1, 6, 7, 87, 6, 8, 1, 4};
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            int position = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < n) {
                    n = numbers[j];
                    position = j;
                }
            }
            if (position != i) {
                int flag = numbers[position];
                numbers[position] = numbers[i];
                numbers[i] = flag;
            }
        }
        for (int m = 0; m < numbers.length; m++) {
            System.out.println("数据" + numbers[m]);
        }
    }

    /**
     * 插入排序  就是左边是排序好的  右边是凌乱的从右边取出一个值 在右边进行对比 让在合适的位置
     */
    private void insertSort() {
        int[] numbers = {0, 5, 1, 6, 7, 87, 6, 8, 1, 4};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    int flag = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = flag;
                }
            }
        }

    }


}

package com.example.android.a0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();}


    // 方法：初始化View
    private void initView() {
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);

        btn1.setOnClickListener(new MyClickListener("启动应用：热门电影"));
        btn2.setOnClickListener(new MyClickListener("启动应用：股票雄鹰"));
        btn3.setOnClickListener(new MyClickListener("启动应用：XYZ阅读器"));
        btn4.setOnClickListener(new MyClickListener("启动应用：最新闻"));
        btn5.setOnClickListener(new MyClickListener("启动应用：毕业设计"));

    }
    class MyClickListener implements View.OnClickListener {
        String confirm_msg;

        public MyClickListener(String confirm_msg)
        {
            this.confirm_msg = confirm_msg;
        }
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                default:
                    Toast.makeText(MainActivity.this, this.confirm_msg, Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}

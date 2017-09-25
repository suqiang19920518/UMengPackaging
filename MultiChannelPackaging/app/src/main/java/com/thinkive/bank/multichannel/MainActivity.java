package com.thinkive.bank.multichannel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * @author: sq
 * @date: 2017/9/24
 * @corporation: 深圳市思迪信息技术股份有限公司
 * @description: 友盟多渠道打包演示
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String channelName = ChannelUtils.getChannelName(this);
        ((TextView) findViewById(R.id.btn_channel_name)).setText(channelName);
    }

}

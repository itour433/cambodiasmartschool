package com.solu.cambodiasmartschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //時刻表示するコードを追加
        Calendar cal = Calendar.getInstance();       //カレンダーを取得

        int iYear = cal.get(Calendar.YEAR);         //年を取得
        int iMonth = cal.get(Calendar.MONTH);       //月を取得
        int iDate = cal.get(Calendar.DATE);         //日を取得
        int iHour = cal.get(Calendar.HOUR);         //時を取得
        int iMinute = cal.get(Calendar.MINUTE);    //分を取得
        int iSecond = cal.get(Calendar.SECOND);    //分を取得

        String strDay = iYear + "/" + iMonth + "/" + iDate + " ";     //日付を表示形式で設定
        String strTime = iHour + "時" + iMinute + "分"; //時刻を表示形式で設

        TextView tv = (TextView)findViewById(R.id.time);
        tv.setText(strDay + strTime);
        //ここまで
    }
    //画面移動（カテゴリー別）

    public void icon1 (View v){
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }

    public void icon2 (View v){
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }

    public void icon3 (View v) {
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }
    public void icon4 (View v){
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }

    public void icon5 (View v){
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }

    public void icon6 (View v){
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }

    public void icon7 (View v){
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }
    public void icon8 (View v){
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }
    public void icon9 (View v){
        Intent intent = new Intent(this, icon1.class);
        startActivity(intent);
    }
    public void info (View v){
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

}

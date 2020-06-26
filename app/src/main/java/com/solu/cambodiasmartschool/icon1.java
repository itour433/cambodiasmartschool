package com.solu.cambodiasmartschool;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class icon1 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon1);

        // ListViewに表示するリスト項目をArrayListで準備する
        ArrayList data = new ArrayList<>();
        data.add("初めての国語読解");
        data.add("わらしべ長者");
        data.add("平家物語");
        data.add("イーハトーヴの夢");
        data.add("坊っちゃん");
        data.add("百人一首");
        data.add("生きもののおきて");
        data.add("モチモチの木");
        data.add("手ぶくろを買いに");
        data.add("あつまれ株の島");
        data.add("ひもじいとおばちゃん");
        data.add("ここまでの人士");

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        // ListViewにArrayAdapterを設定する
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        //ListViewをクリックした際の動作
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(icon1.this, "Toastのテストだよ!", Toast.LENGTH_LONG).show();
            }
        });


        }

    //戻るボタン
    public void onClick(View v) {
        finish();
    }



    //写真追加(text入力ダイアログ)
    public void textadd(View v) {

        //テキスト入力を受け付けるビューを作成
        final EditText editView = new EditText(icon1.this);
        new AlertDialog.Builder(icon1.this)
                .setIcon(android.R.drawable.ic_menu_edit)
                .setTitle("新規テキスト名を入力")
                //setViewにてビューを設定します。
                .setView(editView)
                .setPositiveButton("新規追加", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //入力した文字をトースト出力する
                        Toast.makeText(icon1.this,
                                editView.getText().toString(),
                                Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("キャンセル", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                })
                .show();

    }

    }

package com.example.android_num_15_alertdialog_toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_toast(View v){
        Toast.makeText(this, "Hello World",
                Toast.LENGTH_SHORT).show();
    }
    public void btn_alertDialog(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("對話框測試");  //標題
        builder.setMessage("這是一個對話視窗"); //內容
        builder.setCancelable(true);
        builder.setPositiveButton("關閉視窗", null);    //對話框選項
        builder.show();
    }
}
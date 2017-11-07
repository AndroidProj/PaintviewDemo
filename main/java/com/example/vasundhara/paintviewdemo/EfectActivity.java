package com.example.vasundhara.paintviewdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.effect.Effect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EfectActivity extends AppCompatActivity {

    Button btn_stroke, btn_erase;
    PaintView paintView;
    public static Bitmap b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efect);
        btn_stroke = (Button) findViewById(R.id.btn_stroke);
        btn_erase = (Button) findViewById(R.id.btn_erase);
        paintView = (PaintView) findViewById(R.id.paintview);

        if (getIntent().hasExtra("bitmapImage")) {
            b = BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("bitmapImage"), 0, getIntent().getByteArrayExtra("bitmapImage").length);
        } else {
            Intent intent = new Intent(EfectActivity.this, MainActivity.class);
            startActivity(intent);
        }

        btn_stroke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paintView.setErase(false);
            }
        });
        btn_erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paintView.setErase(true);
            }
        });
    }
}

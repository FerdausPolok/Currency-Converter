package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void ab(String url){

        Intent in = new Intent(Intent.ACTION_VIEW);
        in.setData(Uri.parse(url));
        startActivity(in);

    }
    public void fb(View v){
        ab("https://www.facebook.com/ferdous.zaman.16");
    }
    public void ins(View v){
        ab("https://www.instagram.com/polok_zaman/");
    }
    public void yt(View v){
        ab("https://www.youtube.com/channel/UCNAcbSijltcB0oRcukNBgIw?");
    }

}
